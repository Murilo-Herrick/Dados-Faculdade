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
		
		Connection conn = null;
		PreparedStatement st = null;
		
		try {
			conn = DB.getConnection();
			
			st = conn.prepareStatement(
					"UPDATE vendedor "
					+ "SET salarioBase = salarioBase + ? "
					+ "WHERE  "
					+ "(id = ?)"
					);
			
			st.setDouble(1, 200.0);
			st.setInt(2, 2);
			
			int registros = st.executeUpdate();
			
			System.out.println("Finalizado! Registros = " + registros);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}

}
