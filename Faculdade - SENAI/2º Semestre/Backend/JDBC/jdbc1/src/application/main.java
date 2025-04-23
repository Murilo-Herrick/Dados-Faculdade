package application;

import java.sql.Connection;

import db.DB;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Connection conn = DB.getConnection();
		DB.closeConnection();
	}

}
