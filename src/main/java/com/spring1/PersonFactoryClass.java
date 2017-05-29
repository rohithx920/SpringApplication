package com.spring1;

public class PersonFactoryClass {
	public Person createPerson(int id, String name){
		System.out.println("Using factory to create person");
		return new Person(id,name);	
	}
}
