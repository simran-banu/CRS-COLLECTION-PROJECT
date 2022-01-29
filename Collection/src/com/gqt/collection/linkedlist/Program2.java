
package com.gqt.collection.linkedlist;
import java.util.LinkedList;
/**
 * @author GQT-Trainer
 *
 */
public class Program2 {

	/**
	 * @param args : it is a String type array passed as a parameter to 
	 * the main method
	 * @param ll   : it the instance of the LinkedList class
	 * description : Understanding the push() and pop()
	 */
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.push(10);
		ll.push(20);
		ll.push(30);
		ll.push(40);
		ll.push(50);
		
		System.out.println(ll);
		
		LinkedList ll1 = new LinkedList();
		ll1.push("Raju");
		ll1.push(234567.79);
		ll1.push('r');
		ll1.push(40);
		ll1.push(69.9f);
		
		System.out.println(ll1);
		
		ll.addAll(ll1);
		System.out.println(ll);
		
		ll.pop();
		ll.pop();
		ll.pop();
		ll.pop();
		ll.pop();
		ll.pop();
		ll.pop();
		ll.pop();
		
		System.out.println(ll);
		
		
	}

}
