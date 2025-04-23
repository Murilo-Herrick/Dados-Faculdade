import mysql.connector
import streamlit as st
import pandas as pd

conexao = mysql.connector.connect(
    host='localhost',
    user='root',
    password='aluno',
    database='cursos'
)

cursor = conexao.cursor()


with st.sidebar:
    esc = st.sidebar.selectbox('Selecione a Consulta',("","aluno","curso","matricula"))
st.title("Consulta")
st.divider()

if esc == "aluno" or esc == "curso":
    comando = f'SELECT * FROM ' + esc
    cursor.execute(comando)
    resultado = cursor.fetchall() #Lendo a tabela
    st.subheader("Dados de " + esc)
    df = pd.DataFrame(resultado)
    st.write(df)
    
    
elif esc == 'matricula':
    comando = f'SELECT a.nome, c.nome_curso FROM aluno AS a INNER JOIN associativa_realiza AS r ON a.id_aluno = r.ALUNO_id_aluno INNER JOIN curso AS c ON r.CURSO_id_curso = c.id_curso;'
    cursor.execute(comando)
    resultado = cursor.fetchall() #Lendo a tabela
    st.subheader("Dados de " + esc)
    df = pd.DataFrame(resultado)
    st.write(df)
    
    
cursor.close()
conexao.close()