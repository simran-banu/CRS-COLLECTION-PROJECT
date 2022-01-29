
package com.gqt.collection.arraydeque;

import java.util.ArrayDeque;

/**
 * @author GQT-Trainer
 *
 */
public class Program2 {

	/**
	 * @param args : it is a String type array passed as a parameter to the main method
	 * @param ad1 : it is the reference handle of the ArrayDeque Object
	 * description: 
	 * program shows the working of push() and comparison with add()
	 * program shows the working of pop() and comparison with remove()
	 */
	public static void main(String[] args) {
		ArrayDeque ad1 = new ArrayDeque();
		ad1.push(10);
		ad1.push(20);
		ad1.push(30);
		ad1.push(40);
		ad1.push(50);
		
		System.out.println(ad1);
		
		ArrayDeque ad2 = new ArrayDeque();
		ad2.add(10);
		ad2.add(20);
		ad2.add(30);
		ad2.add(40);
		ad2.add(50);
		
		System.out.println(ad2);
		
		ad2.remove();
		ad2.pop();
		
		System.out.println(ad2);
		
		ad1.pop();
		ad1.remove();
		
		System.out.println(ad1);
	}

}
