package com.spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1) This creates spring bean container 
		ApplicationContext context=new FileSystemXmlApplicationContext("beans.xml");
		
		Person person=(Person)context.getBean("person");
		person.speak();
	}

}
