package com.spring2;

import java.util.List;

public class FruitBasket {
	private String name;
	private List<String> fruits;
	
	public FruitBasket(String name, List<String> fruits){
		this.name=name;
		this.fruits=fruits;
	}
	public String toString(){
		StringBuilder sb=new StringBuilder();
		sb.append("name");
		sb.append("contains:\n");
		for(String str:fruits){
			sb.append(str);
			sb.append("\n");
		}
		return sb.toString();
	}

}
