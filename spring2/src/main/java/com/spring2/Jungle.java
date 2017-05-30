package com.spring2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Jungle {
	private Map<String, String> foods=new HashMap<String, String>();
	
	public void setFoods(Map<String, String> foods){
		this.foods=foods;
	}
	public String toString(){
		StringBuilder sb=new StringBuilder();
		for(Map.Entry<String, String> entry:foods.entrySet()){
			sb.append(entry.getKey()+":"+entry.getValue()+"\n");
		}
		return sb.toString();
	}

}
