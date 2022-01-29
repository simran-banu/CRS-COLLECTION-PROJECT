/**
 * 
 */
package com.gqt.collection.linkedlist;

import java.util.LinkedList;

/**
 * @author GQT-Trainer
 *
 */
public class Program4 {

	/**
	 * @param args : it is a String type array passed as a parameter to 
	 * the main method
	 * @param ll   : it the instance of the LinkedList class
	 * description : to know all the built in methods in LinkedList
	 */
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		System.out.println(ll);
		
		//ll.clear();
		//System.out.println(ll);
		
		System.out.println(ll.contains(40));
		System.out.println(ll.contains(400));
		
		System.out.println(ll.get(4));
		
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println(ll.indexOf(40));
		System.out.println(ll.indexOf(4000));
		System.out.println(ll.isEmpty());
		System.out.println(ll.lastIndexOf(30));
		ll.offer(100);
		System.out.println(ll);
		ll.offerFirst(1000);
		System.out.println(ll);
		ll.offerLast(2000);
		System.out.println(ll);
		System.out.println(ll.peek());
		System.out.println(ll.peekFirst());
		System.out.println(ll.peekLast());
		System.out.println(ll);// no elements will be deleted
		System.out.println(ll.poll());
		System.out.println(ll.pollFirst());
		System.out.println(ll.pollLast());
		
		System.out.println(ll);// all the elements wil be deleted
		
		ll.set(0, 10);
		System.out.println(ll);
		
	}

}
