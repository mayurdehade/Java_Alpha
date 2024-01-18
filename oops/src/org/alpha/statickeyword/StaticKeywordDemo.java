package org.alpha.statickeyword;

class Student{
	String name;
	int roll;
	
	//static variable
	static String SchoolName;
	
	//getter and setter
	void setName(String name) {
		this.name = name;
	}
	void getName() {
		System.out.println(name);
	}
	
	//static method
	static int percentage(int math, int phy, int chem) {
		return (math+phy+chem)/3;
	}
}

public class StaticKeywordDemo {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.SchoolName = "MET";
		
		Student s2 = new Student();
		System.out.println("School name for s2 object is "+s2.SchoolName);
		
		//Static method calling -> calling static method without object
		//for calling the static method of other class use class name and method name
		//in same class use method name only
		System.out.println(Student.percentage(80,87,84)+"%");

	}

	

}
