package jdbc_project1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class ConnectionObject {
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/abc", "root","root");
			return connection;
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}
		return null;

	}

}


