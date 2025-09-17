import os
from flask_cors import CORS
from flask import Flask, request, jsonify
import mysql.connector
import requests

app = Flask(__name__)
CORS(app)


def get_db_connection():
    conn = mysql.connector.connect(
        host=os.environ.get("DB_HOST", "db"),
        user=os.environ.get("DB_USER", "root"),
        password=os.environ.get("DB_PASSWORD", "123456"),
        database=os.environ.get("DB_NAME", "sales"),
    )
    return conn


def create_db():
    conn = get_db_connection()
    cursor = conn.cursor()

    cursor.execute(
        """ 
        CREATE TABLE IF NOT EXISTS sales ( 
            id INT PRIMARY KEY AUTO_INCREMENT,
            product_id INT NOT NULL,
            amount INT NOT NULL,
            price FLOAT NOT NULL,
            status VARCHAR(20) NOT NULL DEFAULT 'pendente',
        """
    )

    conn.commit()
    conn.close()


create_db()


@app.route("/sales", methods=["POST"])
def create_sale():
    conn = get_db_connection()
    data = request.get_json()

    product_id = data.get("product_id")
    amount = data.get("amount")
    price = data.get("price")

    if not id or not amount or not price:
        return jsonify({"error": "id, quantidade e preço são obrigatorios!"}), 400

    try:
        products_response = requests.get("http://products_flask:5000/products")
        products_response.raise_for_status()
        products = products_response.json()

        produto = next((p for p in products if p["id"] == id), None)

        if not produto or produto["amount"] < amount:
            status = "pendente"
        else:
            status = "confirmada"
            product_id = produto["id"]
            requests.put(f"http://products_flask:5000/products/{product_id}/{amount}")
    except requests.exceptions.RequestException:
        status = "pendente"

    cursor = conn.cursor()

    cursor.execute(
        """ INSERT INTO sales (product_id, amount, price) VALUES(%s, %s, %s) """, (product_id, amount, price)
    )
    conn.commit()

    cursor.close()
    conn.close()

    return jsonify({"message": "Venda Registrada!", "status": status}), 200


@app.route("/sales", methods=["GET"])
def get_sales():
    conn = get_db_connection()
    cursor = conn.cursor(dictionary=True)

    cursor.execute(""" SELECT * FROM sales """)
    orders = cursor.fetchall()

    cursor.close()
    conn.close()

    return jsonify(orders)


if __name__ == "__main__":
    app.run(debug=True, host="0.0.0.0", port=5001)
