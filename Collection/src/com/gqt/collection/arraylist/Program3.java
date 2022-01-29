
package com.gqt.collection.arraylist;

import java.util.ArrayList;

/**
 * @author GQT-Trainer
 * description : This is a main method through which we are understanding the 
 * 				 ArrayList
 */
public class Program3 {
	/**
	 * @param args : it is a String type array passed as a parameter to 
	 * 				 the main method
	 * @param al2 : it is the reference handle of the ArrayList Object
	 * description : This method will contain the instantiation of the 
	 * 				 ArrayList class and adding heterogeneous data
	 * point to remember : The below program overcomes one of 
	 * 					   disadvantage of array DS i.e in this program we can 
	 * 					   increase the size of ArrayList
	 * 					   
	 */
	public static void main(String[] args) {
		ArrayList al2 = new ArrayList();
		al2.add(10);//int
		al2.add("GQT");//string
		al2.add('r');//char
		al2.add(234.56f);//float
		al2.add(456789.32);//double
		
		System.out.println(al2);//[10, GQT, r, 234.56, 456789.32]
		
		al2.add(100);//int
		al2.add("JAVA");//string
		
		System.out.println(al2);//[10, GQT, r, 234.56, 456789.32, 100, JAVA]

	}

}
