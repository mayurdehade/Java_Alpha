//JDBC with createStatement

package org.alpha.jdbc;
//import packages
import java.sql.*;

public class JDBCConnect {
	
	//Database attributes 
	//private for security
	//static for accessing without object (Global Scope)
	//final for constant (no need to modify)
	private static final String url = "jdbc:mysql://localhost:3306/mydb";
	private static final String username = "root";
	private static final String password = "mayur";

	public static void main(String[] args) {
		//Load drivers
		try {
			//Load external drivers
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace(); 
			System.out.println(e.getMessage());
		}
		
		
		try {
			//get connection method connect to database and it is in DriverManager class
			//it required three arguments url, username, password
		 	Connection connection = DriverManager.getConnection(url, username, password);
		 	
		 	//create statement (it available at connection interface)
		 	Statement statement = connection.createStatement();
		 	
		 	//create query
		 	String query = "SELECT * FROM student";
		 	
		 	
		 	//for retrieve use executeQuery()
		 	//ResultSet interface stores data retrieved from database
		 	ResultSet resultSet = statement.executeQuery(query);
		 	
		 	//print data
		 	while(resultSet.next()) {
		 		int id = resultSet.getInt("id");
		 		String name = resultSet.getString("name");
		 		int age = resultSet.getInt("age");
		 		double marks = resultSet.getDouble("marks");
		 		
		 		System.out.println(id + " " + name + " " + age + " " + marks);
		 	}
		 	
		 	
		 	//*************** Insert Operation ***********************
		 	//Insert query (we use string format method to insert into database
		 	//for updation and insertion use executeUpdate();
		 	String insertQuery = String.format("INSERT INTO student(name, age, marks) VALUES('%s', %d, %f)", "Milind", 23, 85.2);
		 	
		 	String newQuery = "UPDATE student SET marks = 55 WHERE ID = 4";
		 	//executeUpdate return integer value of how many rows affected
		 	
//		 	int insertResult = statement.executeUpdate(insertQuery);
//		 	System.out.println(insertResult);
//		 	if(insertResult > 0) {
//		 		System.out.println("Data inserted successfully");
//		 	} else {
//		 		System.out.println("Some thing went wrong data not inserted");
//		 	}
		 	
		 	//execute update query
		 	int updateResult = statement.executeUpdate(newQuery);
		 	String message = (updateResult > 0) ? "Data updates successfully!" : "Data not updated";
		 	System.out.println(message);
		 	
		 	
		 	String deleteQuery = "DELETE FROM student WHERE id = 4";
		 	int deleteResult = statement.executeUpdate(deleteQuery);
		 	message = (deleteResult > 0) ? "Deleted successfully" : "Delete Operation Failed";
		 	System.out.println(message);
		 	
		} catch (SQLException e) {
			//it throws SQLException
			System.out.println(e.getMessage());
			e.printStackTrace(); //print full error stack trace
		}

	}

}
