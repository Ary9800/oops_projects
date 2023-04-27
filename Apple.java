package com.app.fruits;

public class Apple extends Fruit {
	public Apple(String color,String name,double weight) {
		super( color, name, weight);
	}
public String taste() {
	return("sweet and sour"); }
	public void jam() {
		System.out.println("name"+getName() + "making jam ");
}
}