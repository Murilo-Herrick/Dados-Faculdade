import mysql.connector
import streamlit as st;

conexao = mysql.connector.connect(
    host='localhost',
    user='root',
    password='aluno',
    database='cursos'
)
cursor = conexao.cursor()
st.title("Cadastrar Curso")


with st.form(key="include_curso", clear_on_submit=True):
    input_nome_curso = st.text_input(label="Nome do Curso")
    input_aulas = st.text_input(label="Aulas")
    input_valor = st.number_input(label="Valor", format="%d", step=1)
    input_turno = st.selectbox(label="Turno", options=["Manhã", "Tarde", "Noite"])
     
    col1, col2 = st.columns(2)
    with col1:
        input_button_submit = st.form_submit_button("Gravar")
    with col2:
        input_button_delete_submit = st.form_submit_button("Excluir")
    
    if input_button_submit: 
        comando = f'INSERT INTO curso(nome_curso,aulas,valor,turno) VALUES("{input_nome_curso}","{input_aulas}","{input_valor}","{input_turno}")'
        cursor.execute(comando)
        conexao.commit()
        
    
    if input_button_delete_submit:
        comando = f'DELETE FROM curso WHERE nome_curso = "{input_nome_curso}"'
        cursor.execute(comando)
        conexao.commit()
        
cursor.close()
conexao.close()
