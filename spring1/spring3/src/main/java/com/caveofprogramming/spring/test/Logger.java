package com.caveofprogramming.spring.test;
import javax.annotation.*;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/*
 * Dummy implementation of logger.
 */

public class Logger {

	//@Autowired(required=false)
	private LogWriter consoleWriter;
	//@Autowired
	private FileWriter fileWriter;
	
	public Logger(){
		
	}
	
	//@Autowired
	public Logger(ConsoleWriter consoleWriter, FileWriter fileWriter) {
		this.consoleWriter = consoleWriter;
		this.fileWriter = fileWriter;
	}
	//@Autowired
	//@Qualifier("consolewriter")
	@Inject
	@Named(value="consoleWriter12")
	public void setConsoleWriter(LogWriter writer) {
		this.consoleWriter = writer;
	}
	@Inject
	@Named(value="fileWriter")
	public void setFileWriter(FileWriter fileWriter) {
		this.fileWriter = fileWriter;
	}
	
	public void writeFile(String text) {
		fileWriter.write(text);
	}
	
	public void writeConsole(String text) {
		if(consoleWriter !=null)
		consoleWriter.write(text);
	}
	//jsr 250 annotations
	@PostConstruct
	public void init(){
		System.out.println("init");
	}
	
	@PreDestroy
	public void destroy(){
		System.out.println("destroy");
	}

}
