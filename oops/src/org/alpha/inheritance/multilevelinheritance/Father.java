package org.alpha.inheritance.multilevelinheritance;

public class Father extends GrandFather {
	private String fname;
	private int fProperty;
	

	//Getters and Setters
	public String getFname() {
		return fname;
	}
	
	public void setFname(String fname) {
		this.fname = fname;
	}
	
	public int getfProperty() {
		return fProperty;
	}
	
	public void setfProperty(int fProperty) {
		this.fProperty = fProperty;
	}

	@Override
	public String toString() {
		return "Father [fname=" + fname + ", fProperty=" + fProperty + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
