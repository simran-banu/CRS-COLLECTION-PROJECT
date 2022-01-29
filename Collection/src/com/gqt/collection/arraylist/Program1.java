
package com.gqt.collection.arraylist;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * @author GQT-Trainer
 * description : This is a main method through which we are understanding the ArrayList
 */
public class Program1 {
	/**
	 * @param args : it is a String type array passed as a parameter to the main method
	 * @param al1 : it is the reference handle of the ArrayList Object
	 * description : This method will contain the instantiation of 
	 * 			     the ArrayList class and operation of for,for each,iterator and listiterator
	 */
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println("Normal way of printing the arraylist:");
		System.out.println(al);
		System.out.println("---------------------------------------");
		System.out.println("printing the arraylist using for loop:");
		for(int i=0;i<=al.size()-1;i++) {
			System.out.println(al.get(i));
		}
		System.out.println("---------------------------------------");
		System.out.println("printing the arraylist using for each loop:");
		for(Object x : al) {
			System.out.println(x);
		}
		System.out.println("---------------------------------------");
		System.out.println("printing the arraylist using for each loop with generics:");
		for(Integer x : al) {
			System.out.println(x);
		}
		System.out.println("---------------------------------------");
		System.out.println("printing the arraylist using itertors:");
		//In java we don't have the concept of pointers but we have Iterators which are the cursors that point to an object
		Iterator<Integer> itr = al.iterator();
		while(itr.hasNext()==true) {
			System.out.println(itr.next());
		}
		
		System.out.println("---------------------------------------");
		System.out.println("printing the arraylist using list itertors:");
		ListIterator<Integer> litr = al.listIterator(0);
		while(litr.hasNext()==true) {
			System.out.println(litr.next());
		}
		System.out.println("---------------------------------------");
		System.out.println("printing the arraylist in reverse order using for loop:");
		for(int i=al.size()-1;i>=0;i--) {
			System.out.println(al.get(i));
		}
		System.out.println("---------------------------------------");
		System.out.println("printing the arraylist using list itertors:");
		ListIterator<Integer> litr1 = al.listIterator(al.size()-1);
		while(litr.hasPrevious()==true) {
			System.out.println(litr.previous());
		}
	}

}
