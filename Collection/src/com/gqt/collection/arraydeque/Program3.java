package com.gqt.collection.arraydeque;

import java.util.ArrayDeque;

/**
 * @author GQT-Trainer
 *
 */
public class Program3 {
	/**
	 * @param args : it is a String type array passed as a parameter to the main method
	 * @param ad1 : it is the reference handle of the ArrayDeque Object
	 * description: 
	 * program shows the working of getFirst() and getLast()
	 * program shows the working of peekFirst() and peekLast()
	 * program shows the working of pollFirst() and pollLast()
	 * program shows the working of removeFirstOccurrence()
	 * program shows the working of toArray()
	 */
	public static void main(String[] args) {
		ArrayDeque ad1 = new ArrayDeque();
		ad1.add(10);
		ad1.add(20);
		ad1.add(30);
		ad1.add(10);
		ad1.add(40);
		ad1.add(50);
		System.out.println(ad1);
		
		System.out.println(ad1.getFirst());
		System.out.println(ad1.getLast());
		ad1.offerFirst(100);
		ad1.offerLast(200);
		System.out.println(ad1);
		System.out.println(ad1.peekFirst());
		System.out.println(ad1.peekLast());
		System.out.println(ad1);
		System.out.println(ad1.pollFirst());
		System.out.println(ad1.pollLast());
		System.out.println(ad1);
		ad1.removeFirstOccurrence(10);
		ad1.removeFirstOccurrence(20);
		System.out.println(ad1);
		Object[] array = ad1.toArray();
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		
	}
}
