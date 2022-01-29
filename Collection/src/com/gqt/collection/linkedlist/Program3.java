
package com.gqt.collection.linkedlist;
import java.util.LinkedList;
/**
 * @author GQT-Trainer
 *
 */
public class Program3 {

	/**
	 * @param args : it is a String type array passed as a parameter to 
	 * the main method
	 * @param ll   : it the instance of the LinkedList class
	 * description : Understanding the data insertion at various positions
	 */
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		
		System.out.println(ll);
		
		ll.add(0, 1000);
		ll.add(ll.size(),2000);
		ll.add(4, 4000);

		System.out.println(ll);

	}

}
