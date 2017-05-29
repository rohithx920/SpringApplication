package com.spring1;

public class Person {
	private int id;
	private String name;
	private int taxid;
	private Address address;
	

public Person(){
	
}

public Person(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}


public void setTaxid(int taxid) {
	this.taxid = taxid;
}




public void setAddress(Address address) {
	this.address = address;
}

@Override
public String toString() {
	return "Person [id=" + id + ", name=" + name + ", taxid=" + taxid + ", address=" + address + "]";
}

public void speak(){
	System.out.println("Hello I am person!");
}
}
