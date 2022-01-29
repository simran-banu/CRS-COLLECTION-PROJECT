
package com.gqt.collection.arraylist;

import java.util.ArrayList;

/**
 * @author GQT-Trainer
 * description : This is a main method through which we are 
 * 				understanding the ArrayList
 */
public class Program2 {
	/**
	 * @param args : it is a String type array passed as a 
	 * 				 parameter to the main method
	 * @param al1 : it is the reference handle of the 
	 * 				ArrayList Object
	 * description : This method will contain the 
	 * 				 instantiation of the ArrayList class 
	 * 				 and adding heterogeneous data
	 * point to remember : The below program overcomes one 
	 * 					   of disadvantage of array DS i.e 
	 * 					   this program accepts heterogeneous data
	 */
	public static void main(String[] args) {
		ArrayList al1 = new ArrayList();
		al1.add(10);//int
		al1.add("GQT");//string
		al1.add('r');//char
		al1.add(234.56f);//float
		al1.add(456789.32);//double
		
		System.out.println(al1);

	}

}
