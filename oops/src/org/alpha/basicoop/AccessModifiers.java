package org.alpha.basicoop;

class BankAccount{
	public String username;
	private String pass;
	
	//setter for set the pass value
	public void setPass(String password) {
		pass = password;
	}
}

public class AccessModifiers {

	public static void main(String[] args) {
		
		//Creating the obj of the BankAccount class
		BankAccount b = new BankAccount();
		b.username = "mayurdehade";
		b.setPass("Mayur@123");
		
		System.out.println(b.username);
	}
}