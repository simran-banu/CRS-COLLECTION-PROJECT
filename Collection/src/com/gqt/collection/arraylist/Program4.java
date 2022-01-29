/**
 * 
 */
package com.gqt.collection.arraylist;

import java.util.ArrayList;

/**
 * @author GQT-Trainer
 * description : This is a main method through which we are understanding the 
 * 				 ArrayList
 *
 */
public class Program4 {

	/**
	 * @param args : it is a String type array passed as a 
	 * parameter to 
	 * 				 the main method
	 * @param al3 : it is the reference handle of the ArrayList 
	 * Object
	 * 
	 * @param al4 : it is the reference handle of the ArrayList
	 *  Object
	 * 
	 * description : Merging the contents of one ArrayList into 
	 * another ArrayList
	 */
	public static void main(String[] args) {
		ArrayList al3 = new ArrayList();
		al3.add(100);
		al3.add(200);
		al3.add(300);
		al3.add(400);
		al3.add(500);
		
		System.out.println("ArrayList-3 before adding ArrayList-4 : "+al3);
		
		ArrayList al4 = new ArrayList();
		al4.add(600);
		al4.add(700);
		al4.add(800);
		al4.add(900);
		
		System.out.println(al4);
		
		al3.addAll(al4);
		
		System.out.println("ArrayList-3 after adding ArrayList-4 : "+al3);
		
		
	}

}
