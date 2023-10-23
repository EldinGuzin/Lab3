package main;

import java.sql.*;


public class DbConnect {

	private static final String CONNECTION_STRING = "jdbc:mysql://localhost:3306/lab3";
	   private static final String USERNAME = "root";
	   private static final String PASSWORD = "1234";


	   private Connection connection = null;


	   public DbConnect() {
	       try {
	           connection = DriverManager.getConnection(CONNECTION_STRING, USERNAME, PASSWORD);
	       } catch (SQLException e) {
	           throw new RuntimeException(e);
	       }
	   }
	}


