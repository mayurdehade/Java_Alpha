//JDBC with createStatement
package org.alpha.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCwithPreparedtatement {
	private static final String url = "jdbc:mysql://localhost:3306/mydb";
	private static final String username = "root";
	private static final String password = "mayur";

	public static void main(String[] args) {
		
		
		try {
			//Load external Drivers
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		} catch (ClassNotFoundException e) {
			System.out.println("Error class not found!" + e);
		}
		
		
		try {
			Connection connection = DriverManager.getConnection(url, username, password);
			
			//******************* Insert Operation ******************
			//query (use ? as placeholder)
			String query = "INSERT INTO student(name, age, marks) VALUES(?, ?, ?)";
		
			//PreparedStatement
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			//set values of placeholders
			//index number and then value
			preparedStatement.setString(1, "Anjali");
			preparedStatement.setInt(2, 21);
			preparedStatement.setDouble(3, 99.99);
			
			int rowAffected = preparedStatement.executeUpdate();
			if(rowAffected > 0) {
				System.out.println("Data Inserted Successfully!");
			} else {
				System.out.println("Data not Inserted!");
			}
			
			
			//*********************** Retrive Operation ****************
			String query2 = "SELECT * FROM student";
			PreparedStatement preparedStatement2 = connection.prepareStatement(query2);
			
			ResultSet resultSet = preparedStatement2.executeQuery();
			while(resultSet.next()) {
				int id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				int age = resultSet.getInt("age");
				double marks = resultSet.getDouble("marks");
				System.out.println(id + " " + name + " " + age + " " + marks);
				
			}
			
			
			
		} catch (SQLException e) {
			
		}

	}

}
