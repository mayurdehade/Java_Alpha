//Base Class
package org.alpha.inheritance.singlelevelinheritance;

public class Citizen {
	private long addharno;
	private String name;
	private String address;
	
	//Getter Setters
	public long getAddharno() {
		return addharno;
	}
	public void setAddharno(long addharno) {
		this.addharno = addharno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	//to String method
	@Override
	public String toString() {
		return "Citizen [addharno=" + addharno + ", name=" + name + ", address=" + address + "]";
	}
	
	
	
}
