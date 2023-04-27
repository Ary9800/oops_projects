package com.app.fruits;
public class Orange extends Fruit {
	public Orange(String color,String name,double weight) {
		super( color, name, weight);
	}
public String taste() {
	return("sour");
}
	public void juice() {
		System.out.println("name"+getName() +"weight"+getWeight() + "extracting juice");
	}
	}
