package com.test.NewOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AbstactDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
	Car c = new Chevi();
		c.start();
		c.gear();
		c.signal();
	}
}
abstract class Car{
	int k;

	public void start(){
		if(k==1)
			System.out.println("Car is starting. Please check your "
					+ " sourroundings and check your blind spot before applying gear");
		else
			System.out.println(" Please enter key");
	}
	public abstract void gear();
	public abstract void signal();
	public abstract void doors();
	public abstract void lights();	
}
 abstract class hondaCivic extends Car {
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 public void gear(){
		try{
			if(k==0)
			System.out.println("Be ready by applying gear");
			int g=Integer.parseInt(br.readLine());
		 switch(g){
		 case 0:
			 System.out.println("Your car is in nutral position now!");
			 break;
		 case 1:
			 System.out.println("You applied first gear and your maximum speed limit is 25 only!");
			 break;
		 case 2: System.out.println("Your car is on second gear and your maximum speed limit is 35 now!");	 
			 break;
		 case 3: System.out.println("You applied third gear and your maximum speed limit is 45 only!");	 
		 	break;
		 case 4: System.out.println("Your You applied forth gear and your maximum speed limit is 55 only!!");	
		 	break;
		 case 5: System.out.println("Car is on reverse gear. Please check "
		 		+ "arround and check your blind spot before applying gear");break;	 
		 }
		 }
		catch(IOException e){
			 System.out.println("Plese apply gear for move foorword i.e 0 to 5");
			}
		catch(Exception e){
			System.out.println(" Some exception ");
		}
		finally{	
			System.out.println("Happy journey");
		}	 
	 } 
	 public void signal(){
	  try{
		  System.out.println(" Enter which way u want to turn? !!!");
		String str= br.readLine();
		if(str=="left")
		System.out.println("You are selected" + str + "turn");
	  }
	  catch(IOException e){
		  System.out.println("Enter signal type only!. i.e Left,Right,Emergency,Back");
	  }
	  finally{
		  
		  System.out.println("turn safely!. have a look on blind spots");
	  }
	 }
 }
 class Chevi extends hondaCivic{
	 public void doors(){
		 
	 }
	 public void lights(){
		 
	 }
 }