package it.exolab.es.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import it.exolab.es.exception.EntityNotFoundError;


import java.sql.DriverManager;
import java.sql.SQLException;



public class BaseCRUD {

	protected Connection connection; 

	public BaseCRUD() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			
		} catch (ClassNotFoundException e) {

		} finally {
		
		}
	}

	protected void openConnection() throws SQLException {
		connection = DriverManager.getConnection("jdbc:mysql://localhost/esercizio1803", "root", "");
		
	}
	protected void closeConnection() {

		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {


			}

		}
	}



}
