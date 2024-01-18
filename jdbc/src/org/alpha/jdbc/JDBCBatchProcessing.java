//JDBC Batch Processing with Create Statement
package org.alpha.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCBatchProcessing {
	private static final String url = "jdbc:mysql://localhost:3306/mydb";
	private static final String username = "root";
	private static final String pass = "mayur";
	
	public static void main(String[] args) {
		
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
		
		try {
			Connection connection = DriverManager.getConnection(url, username, pass);
			//create connection
			Statement statement = connection.createStatement();
			
			//Create Object of Scanner class
			Scanner sc = new Scanner(System.in);
			while(true) {
				System.out.println("Enter name: ");
				String name = sc.next();
				System.out.println("Enter age: ");
				int age = sc.nextInt();
				System.out.println("Enter marks: ");
				double marks = sc.nextDouble();
				
				String query = String.format("INSERT INTO student(name, age, marks) VALUES('%s', %d, %f)" ,name, age, marks);
				
				//add to batch
				statement.addBatch(query);
				
				System.out.println("Want to enter more data Y/N: ");
				String choice = sc.next().toUpperCase();
				if(choice.equals("N")) break;
			}
			
			//executes all query added in batch
			int rowsAffected[] = statement.executeBatch();
			for(int i=0; i<rowsAffected.length; i++) {
				if(rowsAffected[i] == 0) System.out.println("Query " + (i+1) + "th query not exectued!");
				else System.out.println("Query " + (i+1) + "th query executed successfully!");
			}
			
		} catch (SQLException e) {
			
		}

	}

}
