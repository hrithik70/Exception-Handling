package Throwable_class.Exception.Checked;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLexception {
	private static Connection conn;

	private static Connection getConn() {
		String url = "jdbc:mysql://localhost:3306/dbName";
		String user = "root";
		String pass = "root";
		try {
			conn = DriverManager.getConnection(url, user, pass);
		} catch (SQLException e) {
			System.out.println(e); // SQL Exception occur due to wrong url,user,pass
		}
		return conn;
	}

	public static void main(String[] args) {

		getConn();

	}

}
