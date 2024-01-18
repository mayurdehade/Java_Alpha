//Parent Class
package org.alpha.inheritance.hierarchicalinheritance;

public class Father {
	private String fatherName = "BruceLee";
	private String surname = "Marke";
	
	
	public String getFatherName() {
		return fatherName;
	}
	public String getSurname() {
		return surname;
	}
	
	@Override
	public String toString() {
		return "Father [fatherName=" + fatherName + ", surname=" + surname + "]";
	}
	
	
}
