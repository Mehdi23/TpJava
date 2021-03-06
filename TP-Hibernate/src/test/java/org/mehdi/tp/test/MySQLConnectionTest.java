package org.mehdi.tp.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

import junit.framework.TestCase;

public class MySQLConnectionTest extends TestCase {
    
	@Test
	public static void testConnect() {
		String dbUrl = "jdbc:mysql://localhost/INFORMATION_SCHEMA";
		String dbClass = "com.mysql.jdbc.Driver";
		String query = "Select distinct(table_name) from INFORMATION_SCHEMA.TABLES";
		String username = "root";
		String password = "MehdiMySQL";
		try {

			Class.forName(dbClass);
			Connection connection = DriverManager.getConnection(dbUrl,
					username, password);
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query);
			while (resultSet.next()) {
				String tableName = resultSet.getString(1);
				System.out.println("Table name : " + tableName);
			}
			connection.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
