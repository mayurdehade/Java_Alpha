package org.alpha.inheritance.singlelevelinheritance;

public class SingleLevelInheritance {

	public static void main(String[] args) {
		
		Student s = new Student();
		
		//Methods of Base (Parent) class
		s.setName("Mayur");
		s.setAddharno(123456789);
		s.setAddress("Nashik");
		
		//Methods of Child class
		s.setRoll(14);
		s.setStd('A');
		
		System.out.println(s.toString());

	}

}
