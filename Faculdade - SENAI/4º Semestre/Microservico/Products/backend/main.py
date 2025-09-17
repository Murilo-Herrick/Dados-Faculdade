import os
from flask_cors import CORS
from flask import Flask, request, jsonify
import mysql.connector

app = Flask(__name__)
CORS(app)

def get_db_connection():
    conn = mysql.connector.connect(
                host=os.environ.get("DB_HOST", "db"),
                user=os.environ.get("DB_USER", "root"),
                password=os.environ.get("DB_PASSWORD", "123456"),
                database=os.environ.get("DB_NAME", "products")
            )
    return conn

def create_db():
    conn = get_db_connection()
    cursor = conn.cursor()
       
    cursor.execute(""" CREATE TABLE IF NOT EXISTS product (id INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(50), amount INT) """)
    
    conn.commit()
    conn.close()
    
create_db()

@app.route("/products", methods=["POST"])
def create_product():
    conn = get_db_connection()
    data = request.get_json()
    
    name = data.get("name")
    amount = data.get("amount")
    
    if not name or not amount:
        return jsonify({"error": "nome e quantidade são obrigatorios!"}), 400
    
    cursor = conn.cursor()
    
    cursor.execute(""" INSERT INTO product (name, amount) VALUES(%s, %s) """, (name, amount))
    conn.commit()
    
    cursor.close()
    conn.close()
    
    return jsonify({"message" : "Pedido Criado!"}), 200
    

@app.route("/products", methods=["GET"])
def get_products():
    conn = get_db_connection()
    cursor = conn.cursor(dictionary=True)
    
    cursor.execute(""" SELECT * FROM product """)
    orders = cursor.fetchall()
    
    cursor.close()
    conn.close()
    
    return jsonify(orders)

@app.route("/products/<int:product_id>/<int:amount>", methods=["PUT"])
def update_product(product_id, amount):
    conn = get_db_connection()
    cursor = conn.cursor()
    
    cursor.execute(""" SELECT amount FROM product WHERE id = %s""", (product_id,))
    current_amount = cursor.fetchone()
    
    if not current_amount:
        return jsonify({"error": "Produto não encontrado!"}), 404
        
    new_amount = current_amount[0] - amount
    
    cursor.execute(""" UPDATE product SET amount = %s WHERE id = %s""", (new_amount, product_id))
    conn.commit()
    
    cursor.close()
    conn.close()
    
    return jsonify({"message": f"Produto de id: {product_id} atualizado. Novo estoque: {new_amount}"})


if __name__ == "__main__":
    app.run(debug=True, host="0.0.0.0", port=5000)