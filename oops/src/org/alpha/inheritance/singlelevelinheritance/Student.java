//Child Class
package org.alpha.inheritance.singlelevelinheritance;

public class Student extends Citizen {
	private int roll;
	private char std;
	
	//Getters and Setters
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public char getStd() {
		return std;
	}
	public void setStd(char std) {
		this.std = std;
	}
	
	//toString method -> super refers to parent class
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", std=" + std + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
	
	
}
