package com.app.fruits;
import java.util.Scanner;
import java.lang.String;
public class Tester {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner (System.in);
	System.out.println("1.enter the size of array ");
	int size=sc.nextInt();
Fruit[] FruitBasket=new Fruit[size];
int ch;
int index=0;
do {
System.out.println("1.add mango 2.add orange 3.add apple 4.displaying name of all fruit 5.displaying name,color,weigth,taste of all fruit 6.marked given fruit stale 7.marked all sour fruit stale 8.showing funxtion of given fruit ");
System.out.println("1.enter the choice ");
ch=sc.nextInt();
switch(ch) {
case 1:
	
	if(index<FruitBasket.length) {
		System.out.println("1.add th mango ");
	FruitBasket[index]=new Mango(sc.next(),sc.next(),sc.nextInt());
	index++;
	}
	else
	{
		System.out.println("array is full");
	}
	
	break;
case 2:
	if(index<FruitBasket.length) {
		System.out.println("1.add th orange ");
		FruitBasket[index]=new Orange(sc.next(),sc.next(),sc.nextInt());
		index++;
		}
		else
		{
			System.out.println("array is full");
		}
	break;
case 3:
	if(index<FruitBasket.length) {
		System.out.println("1.add th apple ");
		FruitBasket[index]=new Apple(sc.next(),sc.next(),sc.nextInt());
		index++;
		}
		else
		{
			System.out.println("array is full");
		}
	break;
case 4:
	System.out.println("name of fruits are:-");
	for(Fruit f:FruitBasket) {
		System.out.println(f.getName());
	}
	break;
case 5:
	System.out.print("name of fruits are:-");
	for(Fruit f:FruitBasket) {
		System.out.println(f.getName()+"color of fruit"+f.getColor()+"weight of fruit"+f.getWeight()+"taste of fruit"+f.taste());
	}
	break; 
	case 6:
		System.out.println("enter the index");
		int in=sc.nextInt();
		if(in<FruitBasket.length) {
			FruitBasket[in].setFresh(false);
		}
		else {
			System.out.println("index is not valid");
		}
		break;
	case 7:
		for(Fruit f:FruitBasket) {
		String str=f.taste();
		if(str.equals("sour")) {
			f.setFresh(false);
		}
		}
		break;
	case 8:System.out.println("enter the index");
	int in2=sc.nextInt();
			if(FruitBasket[in2] instanceof Mango) {
				((Mango)FruitBasket[in2]).pulp();
			}
			else if (FruitBasket[in2] instanceof Orange) {
				((Orange)FruitBasket[in2]).juice();
			}
			else 
			{
				((Apple)FruitBasket[in2]).jam();
			}
		
		
		break;
		default:
		System.out.println("invalid choice");
		break;
			
}
}while(ch!=9);
		System.out.println("thank you");
}
	}


