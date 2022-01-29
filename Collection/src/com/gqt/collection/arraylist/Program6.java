/**
 * 
 */
package com.gqt.collection.arraylist;

import java.util.ArrayList;

/**
 * @author GQT-Trainer
 *
 */
public class Program6 {

	/**
	 * @param args : it is a String type array passed as a parameter to 
	 * 				 the main method
	 * @param al7 : it is the reference handle of the ArrayList Object
	 * 
	 * description : getting the class name to which al7 belongs to
	 * 				 getting the size of the arraylist
	 * 				 checking if the arraylist is empty or not
	 */
	public static void main(String[] args) {
		ArrayList al7 = new ArrayList();
		al7.add(100);//0
		al7.add(200);//1
		al7.add(300);//2
		al7.add(400);//3
		al7.add(500);//4
		System.out.println(al7);
		
		System.out.println(al7.getClass());
		
		System.out.println(al7.size());//5
		
		System.out.println(al7.isEmpty());//false
		
		al7.clear();// removes all the contents from the arraylist
		
		System.out.println(al7.isEmpty());//true
		
		System.out.println(al7);
		
	}

}
