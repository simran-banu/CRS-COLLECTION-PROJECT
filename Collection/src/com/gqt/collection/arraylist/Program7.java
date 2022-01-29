/**
 * 
 */
package com.gqt.collection.arraylist;

import java.util.ArrayList;

/**
 * @author GQT-Trainer
 *
 */
public class Program7 {

	/**
	 * @param args : it is a String type array passed as a parameter to 
	 * 				 the main method
	 * @param al8 : it is the reference handle of the ArrayList Object
	 * @param al9 : it is the reference handle of the ArrayList Object
	 * 
	 * description : this program helps to check if the ArrayList contains a specific element or not
	 * 				 this program helps to check if the ArrayList contains a another ArrayList or not
	 * 				 this program helps to get the element from specified position
	 */
	public static void main(String[] args) {
		ArrayList al8 = new ArrayList();
		al8.add(100);//0
		al8.add(200);//1
		al8.add(300);//2
		al8.add(400);//3
		al8.add(500);//4
		System.out.println(al8);
		
		System.out.println(al8.contains(100));//true
		System.out.println(al8.contains(1000));//false
		
		ArrayList al9 = new ArrayList();
		al9.add(600);
		al9.add(700);
		al9.add(800);
		al9.add(900);
		System.out.println(al9);
		
		System.out.println(al8.containsAll(al9));//false
		
		al8.addAll(al9);//collected as a collection
		System.out.println(al8);
		
		System.out.println(al8.containsAll(al9));//true
		
		System.out.println(al8.get(5));//600
		//System.out.println(al8.get(50));//exception : IndexOutOfBoundsException
		
		//al8.add(al9);//collected as object
		
		al8.add(al9.get(0));
		
		System.out.println(al8);
	}

}
