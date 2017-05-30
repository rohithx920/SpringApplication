package com.spring2;

import java.util.List;

public class Jungle {
	private Animal largest;
	private List<Animal> animals;
	
	
	
	public Animal getLargest() {
		return largest;
	}
	public void setLargest(Animal largest) {
		this.largest = largest;
	}
	public List<Animal> getAnimals() {
		return animals;
	}
	public void setAnimals(List<Animal> animals) {
		this.animals = animals;
	}
	public String toString(){
		StringBuilder sb=new StringBuilder();
		sb.append("Largest"+largest);
		sb.append("Others:\n");
		for(Animal str:animals){
			sb.append(str);
			sb.append("\n");
		}
		return sb.toString();
	}

}
