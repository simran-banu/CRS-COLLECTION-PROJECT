/**
 * 
 */
package com.gqt.collection.treeset;

import java.util.TreeSet;

/**
 * @author GQT-Trainer
 *
 */
public class Program2 {

	/**
	 * @param args : it is a String type array passed as a parameter to 
	 * the main method
	 * @param ts : it is an instance of TreeSet
	 * description : to understand the working of various methods of the TreeSet
	 */
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(100);
		ts.add(50);
		ts.add(150);
		ts.add(25);
		ts.add(75);
		ts.add(125);
		ts.add(175);
		System.out.println(ts);
		System.out.println(ts.ceiling(100));// this method will return the value which greater than or equal to the passed value
		System.out.println(ts.floor(100));// this method will return the value which lesser than or equal to the passed value
		System.out.println(ts.ceiling(80));//100
		System.out.println(ts.floor(80));//75
		System.out.println(ts.ceiling(180));//null --> because the passed value is greater than the highest value in the set
		System.out.println(ts.floor(23));//null --> because the passed value is lesser than the least value in the set
		
		System.out.println(ts.higher(100));// this method will return the value which greater than the passed value
		System.out.println(ts.lower(100));// this method will return the value which lesser than the passed value
		System.out.println(ts.higher(175));//null --> because the passed value is greater or equal to than the highest value in the set
		System.out.println(ts.lower(25));//null --> because the passed value is lesser than or equal to the least value in the set
		
		System.out.println(ts.clone());// this method is used to create a copy of the collection
		
		//ts.clear();
		
		//System.out.println(ts);
		
		System.out.println(ts.contains(125));//true
		System.out.println(ts.contains(1250));//false
		
		System.out.println(ts.first());//this method will return the first element in the set
		System.out.println(ts.last());//this method will return the last element in the set
		
		System.out.println(ts.headSet(125));// this method will return the set of elements till the specified value
		System.out.println(ts.headSet(75));// 25, 50
		System.out.println(ts.tailSet(125));// this method will return the set of elements from the specified value till last value
		System.out.println(ts.tailSet(75));//75, 100, 125, 150, 175
		
		System.out.println(ts.pollFirst());//50, 75, 100, 125, 150,175
		System.out.println(ts.pollLast());// 50, 75, 100, 125, 150,
		System.out.println(ts);
		System.out.println(ts.subSet(50, 150));//this method will return the set of elements in the given range : 50, 75, 100, 125
		
	}

}
