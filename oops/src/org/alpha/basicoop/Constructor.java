package org.alpha.basicoop;

class Student1{
	String name;
	int roll;
	int marks[]; //created an array
	
	//constructor
	//Default
	Student1(){
		System.out.println("Default Constructor Called");
	}
	
	//Parameterize Constructor
	Student1(String name, int rol){
		this.name = name;
		this.roll = rol;
		this.marks = new int[3];
		this.marks[0] = 100;
		this.marks[1] = 90;
		this.marks[2] = 29;
		System.out.println("Parameterized Constructor Called");
	}
	
	//Constructor Overloading
	Student1(String name){
		this.name = name;
		System.out.println("Constructors with name called");
	}
	Student1(int rol){
		this.roll = rol;
		System.out.println("Constructors with roll called");
	}
	
	
	
	//Copy Constructor -> Copy all the values of the object to other object
	//If we copy the element from the one object array to another object array then if we change the element of the first object
	//then second object element is automatically changed because it refers the address of the array
	//new array not created
	
	//shallow constructor
	Student1(Student1 s1){
		this.name = s1.name;
		this.roll = s1.roll;
		this.marks = new int[3];
		this.marks = s1.marks; //copy the value of the s1 constructor marks to new obj marks 
		System.out.println("Shallow Copy Constructor is called");
	}
	
	//Deep constructor
	Student1(Student1 s1, int roll){
		this.name = s1.name;
		this.roll = s1.roll;
		this.marks = new int[3];
		for(int i=0; i<3; i++) {
			this.marks[i] = s1.marks[i];
		}
		System.out.println("Deep Copy Constructor is called");
	}
}

public class Constructor {

	public static void main(String[] args) {
		//Creating the object of student class
		Student1 s = new Student1();
		
		//Parameterized Constructor called
		Student1 s1 = new Student1("Dipak", 14);
		
		Student1 s3 = new Student1("Mayur");
		Student1 s4 = new Student1(123);
		
		//Calling copy constructor
		Student1 s5 = new Student1(s1);
		
		Student1 s6 = new Student1(s1,12);
		
		//modifying the element of the s1 obj
		s1.marks[1] = 2930;
		
		for(int i=0; i<3; i++) {
			System.out.println(s5.marks[i] + " " + s6.marks[i]);
		}
		
		

	}

}
