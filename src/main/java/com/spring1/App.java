package com.spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1) This creates spring bean container 
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/bean/beans.xml");
		
		Person person=(Person)context.getBean("person");
		
		person.speak();
		System.out.println(person.toString());
		//2) Added close on filesystem
		((ClassPathXmlApplicationContext)context).close();
	}

}
