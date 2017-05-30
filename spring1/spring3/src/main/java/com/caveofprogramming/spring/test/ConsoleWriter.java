package com.caveofprogramming.spring.test;

import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier("consolewriter")
public class ConsoleWriter implements LogWriter {

	public void write(String text) {
		System.out.println(text);
	}

}
