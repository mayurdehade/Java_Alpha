package org.alpha.inheritance.hierarchicalinheritance;

public class HierarchicalInheritance {

	public static void main(String[] args) {
		
		Child1 c1 = new Child1();
		Child2 c2 = new Child2();
		
		c1.setC1Name("Vikey");
		c2.setC2Name("Rokey");
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());

	}

}
