/**
 * 
 */
package com.gqt.collection.arraydeque;

import java.util.ArrayDeque;

/**
 * @author GQT-Trainer
 * description : This is a main method through which we are understanding the ArrayDeque
 */
public class Program1 {

	/**
	 * @param args : it is a String type array passed as a parameter to the main method
	 * @param ad1 : it is the reference handle of the ArrayDeque Object
	 * @param ad2 : it is the reference handle of the ArrayDeque Object
	 * description: to understand the functionality of ArrayDeque add methods
	 */
	public static void main(String[] args) {
		ArrayDeque ad1 = new ArrayDeque();
		ad1.add(10);
		ad1.add(20);
		ad1.add(30);
		ad1.add(40);
		ad1.add(50);
		
		System.out.println(ad1);
		
		
		/*
		ad1.addFirst(1000);
		ad1.addLast(2000);
		
		System.out.println(ad1);
		
		ArrayDeque ad2 = new ArrayDeque();
		ad2.add(100);
		ad2.add(200);
		ad2.add(300);
		ad2.add(400);
		ad2.add(500);
		
		System.out.println(ad2);
		
		ad1.addAll(ad2);
		
		System.out.println(ad1);*/
	}

}
