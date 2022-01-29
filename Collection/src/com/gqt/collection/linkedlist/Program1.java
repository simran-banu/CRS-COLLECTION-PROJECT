
package com.gqt.collection.linkedlist;
import java.util.LinkedList;
/**
 * @author GQT-Trainer
 *
 */
public class Program1 {

	/**
	 * @param args : it is a String type array passed as a parameter to 
	 * the main method
	 * @param ll   : it the instance of the LinkedList class
	 * description : Understanding the variations in the remove()
	 */
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(10);
		ll.add(40);
		ll.add(50);
		ll.add(10);
		
		System.out.println(ll);
		
		LinkedList ll1 = new LinkedList();
		ll1.add("Raju");
		ll1.add(234567.79);
		ll1.add('r');
		ll1.add(10);
		ll1.add(69.9f);
		
		System.out.println(ll1);
		
		ll.addAll(ll1);
		
		System.out.println(ll);//10, 20, 30, 10, 40, 50, 10, Raju, 234567.79, r, 10, 69.9
		
		ll.remove();
		System.out.println(ll);//20, 30, 10, 40, 50, 10, Raju, 234567.79, r, 10, 69.9
		
		ll.remove(4);
		System.out.println(ll);//20, 30, 10, 40, 10, Raju, 234567.79, r, 10, 69.9
		
		ll.removeFirst();
		System.out.println(ll);// 30, 10, 40, 10, Raju, 234567.79, r, 10, 69.9
		
		ll.removeLast();
		System.out.println(ll);// 30, 10, 40, 10, Raju, 234567.79, r, 10
		
		ll.removeFirstOccurrence(10);
		System.out.println(ll);// 30, 40, 10, Raju, 234567.79, r, 10
		
		ll.removeLastOccurrence(10);
		System.out.println(ll);// 30, 40, 10, Raju, 234567.79, r
		
		ll.removeAll(ll1);
		System.out.println(ll);// 30, 40
	}

}
