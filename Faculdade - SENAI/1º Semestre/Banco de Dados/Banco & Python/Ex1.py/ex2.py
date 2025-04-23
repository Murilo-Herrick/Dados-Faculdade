import streamlit as st
import mysql.connector

conexao = mysql.connector.connect(
    host = "localhost", 
    user = "root",
    password = "aluno",
    database = "clientes"
)

cursor = conexao.cursor()


with st.form(key="include_cliente"):
    input_nome = st.text_input(label="Entre com seu nome")
    input_idade = st.number_input(label="Entre com sua idade",format="%d",step=1)
    input_profissao = st.selectbox(label="Entre com sua profissão",options=["Selecione...","Professor","Auxiliar Administrativo","Almoxarife"])
    input_data_admissao = st.date_input(label="Entre com a data de admissão")
    col1, col2 = st.columns(2)
    with col1:
        input_button_submit = st.form_submit_button("Enviar")
    with col2:
        input_button_Delete_submit = st.form_submit_button("Excluir")

    # if input_button_submit:
        #st.write(f"Nome: {input_nome}")
        #st.write(f"Idade: {input_idade}")
        #st.write(f"Profissão: {input_profissao}")
        #st.write(f"Data de Admissão: {input_data_admissao}")
    if input_button_submit:
        comando = f'INSERT INTO cliente(nome,idade,profissao,data_admissao) VALUES ("{input_nome}", "{input_idade}", "{input_profissao}", "{input_data_admissao}")'
        cursor.execute(comando)
        conexao.commit()#Edita Banco de Dados
    
    if input_button_Delete_submit:
        comando = f'DELETE FROM cliente WHERE nome = "{input_nome}"'
        cursor.execute(comando)
        conexao.commit()

cursor.close()
conexao.close()