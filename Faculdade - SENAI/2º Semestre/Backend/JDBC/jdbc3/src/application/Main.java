package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Connection conn = null;
		PreparedStatement st = null;
		
		try {
			conn = DB.getConnection();
			
//			st = conn.prepareStatement(
//					"INSERT INTO vendedor "
//					+ "(nome, email, dataNascimento, salarioBase, Departamento_id)"
//					+ "VALUES "
//					+ "(?, ?, ?, ?, ?)"
//					);
			
			st = conn.prepareStatement(
					"INSERT INTO vendedor "
					+ "(nome, email, dataNascimento, salarioBase, Departamento_id)"
					+ "VALUES "
					+ "(?, ?, ?, ?, ?)",
					Statement.RETURN_GENERATED_KEYS
					);
			
			st.setString(1, "Murilo Herrick");
			st.setString(2, "muriloherrick@gmail.com");
			st.setDate(3, new java.sql.Date(sdf.parse("14/06/2006").getTime()));
			st.setDouble(4, 3000.0);
			st.setInt(5, 4);
			

			
			int registros = st.executeUpdate();
			
			if (registros > 0) {
				ResultSet rs = st.getGeneratedKeys();
				while(rs.next()) {
					int id = rs.getInt(1);
					System.out.println("Finalizado! ID = " + id);
				}
			}
			else {
				System.out.println("Nenhum registro alterado!");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		} finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}

}
