/**
 * 
 */
package com.gqt.collection.linkedhashset;

import java.util.LinkedHashSet;

/**
 * @author GQT-Trainer
 *
 */
public class Program1 {

	/**
	 * @param args : it is a String type array passed as a parameter to 
	 * the main method
	 * @param hs : it is the instance of the LinkedHashSet
	 */
	public static void main(String[] args) {
		LinkedHashSet hs = new LinkedHashSet();
		hs.add(100);
		hs.add(50);
		hs.add(456);
		hs.add(150);
		hs.add(25);
		hs.add(75);
		hs.add(156);
		hs.add(125);
		hs.add(777);
		hs.add(175);
		System.out.println(hs);
	}

}
