package org.alpha.inheritance.hierarchicalinheritance;

public class Child2 extends Father {
	
	private String c2Name;

	public String getC2Name() {
		return c2Name;
	}

	public void setC2Name(String c2Name) {
		this.c2Name = c2Name;
	}

	@Override
	public String toString() {
		return "Child2 [c2Name=" + c2Name + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
