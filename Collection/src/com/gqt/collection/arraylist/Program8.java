/**
 * 
 */
package com.gqt.collection.arraylist;

import java.util.ArrayList;

/**
 * @author GQT-Trainer
 *
 */
public class Program8 {

	/**
	 * @param args : it is a String type array passed as a parameter to 
	 * 				 the main method
	 * @param al8 : it is the reference handle of the ArrayList Object
	 * @param al9 : it is the reference handle of the ArrayList Object
	 * 
	 * description : we use indeOf() to get the index value of the specified element
	 * 				 we use lastIndexOf() to get the last occurance position of the specified element
	 * 				 we use set() to replace the element in the specified position with the new element
	 */
	public static void main(String[] args) {
		ArrayList al8 = new ArrayList();
		al8.add(100);//0
		al8.add(200);//1-----
		al8.add(300);//2-----
		al8.add(400);//3
		al8.add(200);//4-----
		al8.add(300);//5-----
		al8.add(500);//6
		al8.add(200);//7-----
		al8.add(300);//8-----
		System.out.println(al8);
		System.out.println(al8.indexOf(300));
		ArrayList al9 = new ArrayList();
		al9.add(600);
		al9.add(700);
		al9.add(800);
		al9.add(900);
		al8.add(al9.get(al9.indexOf(700)));
		al8.add(al9.get(al9.indexOf(800)));
		System.out.println(al8);
		System.out.println(al8.lastIndexOf(200));
		System.out.println(al8.lastIndexOf(300));
		al8.add(4, 999);
		System.out.println(al8);
		al8.set(5, 888);// replaces the element in specified position
		System.out.println(al8);
	}

}
