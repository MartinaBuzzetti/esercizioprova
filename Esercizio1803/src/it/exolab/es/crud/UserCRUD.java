package it.exolab.es.crud;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



import it.exolab.es.exception.EntityNotFoundError;
import it.exolab.es.model.User;

public class UserCRUD extends BaseCRUD {
	
	
		public User find(int pin) throws EntityNotFoundError{
			
			User ret= null;
			try {
				openConnection();
				String query = "Select * from user where pin=?";
				PreparedStatement statement = connection.prepareStatement(query);
				statement.setInt(1, (int)pin);
				ResultSet resultSet = statement.executeQuery();
				
				if(resultSet.first() ) {
					 ret = new User();
					 ret.setId(resultSet.getInt("id"));
					 ret.setName(resultSet.getString("name"));
				     ret.setSurname(resultSet.getString("surname"));
				     ret.setEmail(resultSet.getString("email"));
				     ret.setPassword(resultSet.getString("password"));
				     ret.setPin(resultSet.getInt("pin"));
				     ret.setRole_id(resultSet.getInt("role_id"));
				     ret.setRole(null);
				}
				
			} catch (SQLException e) {
				
			} finally {
				closeConnection();
				
			} if(ret==null) {
				throw new EntityNotFoundError();
			}
			
			return ret;
			
		}
		
		

		User findByPin(String email,String password) throws EntityNotFoundError{
			User ret= null;
			try {
				openConnection();
				String query = "Select * from user where email=? and password=?";
				PreparedStatement statement = connection.prepareStatement(query);
				statement.setString(1, (String)email);
				statement.setString(2, (String)password);
				ResultSet resultSet = statement.executeQuery();
				
				if(resultSet.first() ) {
					 ret = new User();
					 ret.setId(resultSet.getInt("id"));
					 ret.setName(resultSet.getString("name"));
				     ret.setSurname(resultSet.getString("surname"));
				     ret.setEmail(resultSet.getString("email"));
				     ret.setPassword(resultSet.getString("password"));
				     ret.setPin(resultSet.getInt("pin"));
				     ret.setRole_id(resultSet.getInt("role_id"));
				     ret.setRole(null);
				}
				
			} catch (SQLException e) {
				
			} finally {
				closeConnection();
				
			} if(ret==null) {
				throw new EntityNotFoundError();
			}
			
			return ret;
			
			
		}
		
		User findByPin(int id) throws EntityNotFoundError{
			
			User ret= null;
			try {
				openConnection();
				String query = "Select * from user where id=?";
				PreparedStatement statement = connection.prepareStatement(query);
				statement.setInt(1, (int)id);
				ResultSet resultSet = statement.executeQuery();
				
				if(resultSet.first() ) {
					 ret = new User();
					 ret.setId(resultSet.getInt("id"));
					 ret.setName(resultSet.getString("name"));
				     ret.setSurname(resultSet.getString("surname"));
				     ret.setEmail(resultSet.getString("email"));
				     ret.setPassword(resultSet.getString("password"));
				     ret.setPin(resultSet.getInt("pin"));
				     ret.setRole_id(resultSet.getInt("role_id"));
				     ret.setRole(null);
				}
				
			} catch (SQLException e) {
				
			} finally {
				closeConnection();
				
			} if(ret==null) {
				throw new EntityNotFoundError();
			}
			
			return ret;
			
		}
		
			
		}


