package us.kcadventuro.theriver.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TheRiverConnection {

	private static String username;
	private static String password;
	private static String connectionString;
	
	public static Connection getConnection() throws SQLException{
		
		return DriverManager.getConnection(connectionString);		
	}
}
