package com.crudservletfreemaker.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.crudservletfreemaker.model.User;
import com.crudservletfreemaker.util.DBUtility;

public class CrudDao {

	private Connection connection;

	public CrudDao() {
		connection = DBUtility.getConnection();
	}

	public void addUser(User user) {
		try {
			PreparedStatement preparedStatement = connection.prepareStatement("insert into user(firstname, lastname, email) values ?, ?, ? ");
			preparedStatement.setString(1, user.getFirstName());
			preparedStatement.setString(2, user.getLastName());
			preparedStatement.setString(3, user.getEmail());
			
			preparedStatement.executeUpdate();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	public void deleteUser(int userId) {

	}

	public void updateUser(User user) {

	}

	public List<User> getAllUsers() {
		return null;
	}
}
