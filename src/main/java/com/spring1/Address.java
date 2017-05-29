package com.spring1;

public class Address {
	private String street;
	private String postcode;
	public Address(String street, String postcode) {
		super();
		this.street = street;
		this.postcode = postcode;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", postcode=" + postcode + "]";
	}
	//once bean is created they will run 
	public void init(){
		System.out.println("Bean Created"+this);
	}
		
}