package com.spring1;

public class Person {
	private int id;
	private String name;
	private int taxid;
	

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




@Override
public String toString() {
	return "Person [id=" + id + ", name=" + name + ", taxid=" + taxid + "]";
}



public void speak(){
	System.out.println("Hello I am person!");
}
}
