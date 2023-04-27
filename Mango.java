package com.app.fruits;

public class Mango extends Fruit {
	public Mango(String color,String name,double weight) {
		super( color, name, weight);
	}
public String taste() {
	return("sweet");
}
	public void pulp() {
		System.out.println("name"+getName() +"color"+getName() + "Creating pulp");
	}


}

