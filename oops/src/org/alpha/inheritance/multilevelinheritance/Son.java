package org.alpha.inheritance.multilevelinheritance;

public class Son extends Father {
	private String sname;
	private int totalProperty;
	
	//Getters and Setters
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getTotalProperty() {
		return totalProperty;
	}
	public void setTotalProperty(int totalProperty) {
		this.totalProperty = totalProperty;
	}
	
	
	@Override
	public String toString() {
		return "Son [sname=" + sname + ", totalProperty=" + totalProperty + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
}
