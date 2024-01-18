package org.alpha.inheritance.multilevelinheritance;

public class MultilevelInheritanceExecutor {
	
	public static void main(String args[]) {
		Son s = new Son();
		
		s.setName("Grand Father Shantaram");
		s.setFname("Father Tukaram");
		s.setSname("Son Dagadu");
		
		s.setProperty(1000);
		s.setfProperty(2000);
		s.setTotalProperty(s.getProperty()+s.getfProperty());
		
		//calling to string method
		
		System.out.println(s.toString());
	}
}
