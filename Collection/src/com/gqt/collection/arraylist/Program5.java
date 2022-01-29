/**
 * 
 */
package com.gqt.collection.arraylist;

import java.util.ArrayList;

/**
 * @author GQT-Trainer
 *
 */
public class Program5 {

	/**
	 * @param args : it is a String type array passed as a parameter to 
	 * 				 the main method
	 * @param al5 : it is the reference handle of the ArrayList Object
	 * 
	 * @param al6 : it is the reference handle of the ArrayList Object
	 * 
	 * description : Merging the contents of one ArrayList into another
	 * ArrayList at the specified index position

	 */
	public static void main(String[] args) {
		ArrayList al5 = new ArrayList();
		al5.add(100);
		al5.add(200);
		al5.add(300);
		al5.add(400);
		al5.add(500);
		
		System.out.println(al5);
		
		al5.add(2, 3000);
		
		System.out.println("ArrayList-5 before adding ArrayList-6 : "+al5);
		
		
		ArrayList al6 = new ArrayList();
		al6.add(600);
		al6.add(700);
		al6.add(800);
		al6.add(900);
		
		System.out.println(al6);
		
		al5.addAll(2, al6);
		
		System.out.println("ArrayList-5 after adding ArrayList-6 : "+al5);
		
		
	}

}
