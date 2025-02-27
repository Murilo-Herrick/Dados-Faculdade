import mysql.connector
import streamlit as st;

conexao = mysql.connector.connect(
    host='localhost',
    user='root',
    password='aluno',
    database='cursos'
)
cursor = conexao.cursor()
st.title("Cadastrar Aluno")

with st.form(key="include_aluno", clear_on_submit=True):
    input_nome = st.text_input(label="Nome")
    col1,col2 = st.columns(2)
    with col1:
        input_cpf = st.text_input(label="CPF")
        input_sexo = st.selectbox("Sexo",options=["Masculino", "Feminino"])
        input_uf = st.selectbox("Estado", options=["AL","AM","BH","CE","DF","SP","RJ"])
        input_cidade = st.text_input(label="Cidade")
    with col2:
        input_rua  = st.text_input(label="Rua")
        input_numero = st.number_input(label="Numero", format="%d", step=1)
        input_telefone_fixo = st.text_input(label="Telefone fixo")
        input_telefone_celular = st.text_input(label="Telefone celular")
        
    col1, col2 = st.columns(2)
    with col1:
        input_button_submit = st.form_submit_button("Gravar")
    with col2:
        input_button_delete_submit = st.form_submit_button("Excluir")
        
    if input_button_submit: 
        comando = f'INSERT INTO aluno(nome,cpf,sexo,estado,cidade,rua,numero,telefone_fixo,telefone_celular)VALUES ("{input_nome}","{input_cpf}","{input_sexo}","{input_uf}", "{input_cidade}","{input_rua}",{input_numero}, "{input_telefone_fixo}", "{input_telefone_celular}")'
        cursor.execute(comando)
        conexao.commit()
    
    if input_button_delete_submit:
        comando = f'DELETE FROM aluno WHERE nome = "{input_nome}"'
        cursor.execute(comando)
        conexao.commit()
        
cursor.close()
conexao.close()
        