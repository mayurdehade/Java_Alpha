package org.alpha.basicoop;

class Student{
	//variables (Properties)
	String name;
	int rollNo;
	int age;
	
	//Functions/Methods (Behaviors)
	void setName(String n) {
		name = n;
	}
	
	void setRollNo(int rol) {
		rollNo = rol;
	}
	
	void setAge(int a) {
		age = a;
	}
}

public class Basic {

	public static void main(String[] args) {
		//Creating the Object of Student class
		//Object is a real time entity -> for accessing the class element we have to create object
		Student s = new Student();
		
		s.setName("Mayur");
		s.setRollNo(18);
		s.setAge(20);
		
		//Printing the values
		System.out.println("Name: "+s.name);
		System.out.println("Roll No: "+s.rollNo);
		System.out.println("Age: "+s.age);

	}

}
