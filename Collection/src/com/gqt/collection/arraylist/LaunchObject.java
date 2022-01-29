/**
 * 
 */
//Example for storing different user defined objects inside the ArrayList class 

package com.gqt.collection.arraylist;

import java.util.ArrayList;

/**
 * @author GQT-Trainer
 * this program is an example to showcase that the ArrayList class can store anytype of objects
 */

class Lion{
	String name;
	int age;
	String color;

	public Lion(String name, int age, String color) {
		super();
		this.name = name;
		this.age = age;
		this.color = color;
	}
}
class Tiger{
	String name;
	int age;
	String color;

	public Tiger(String name, int age, String color) {
		super();
		this.name = name;
		this.age = age;
		this.color = color;
	}

}
public class LaunchObject {

	/**
	 * @param args : it is a String type array passed as a parameter to 
	 * the main method
	 * @param l1,l2,l3 : Instances of the class Lion
	 * @param t1,t2,t3 : Instances of the class Tiger
	 */
	public static void main(String[] args) {
		Lion l1 = new Lion("Ramu", 5, "white");
		Lion l2 = new Lion("Sunny", 3, "Orange");
		Lion l3 = new Lion("Seetha", 4, "white");

		Tiger t1 = new Tiger("Ramu", 5, "white");
		Tiger t2 = new Tiger("Sunny", 3, "Orange");
		Tiger t3 = new Tiger("Seetha", 4, "white");

		/**
		 * @param al : It is the instance of the ArrayList which hold only the any type of data as we have not used the generics on it
		 */
		ArrayList al = new ArrayList();
		al.add(l1);//lion
		al.add(l2);//lion
		al.add(l3);//lion
		al.add(t1);//tiger
		al.add(t2);//tiger
		al.add(t3);//tiger
		

		System.out.println(al);
		
		/**
		 * @param al1 : It is the instance of the ArrayList which hold only the string type of data as we have used the generics on it
		 */
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("Rohith");
		al1.add("Virat");
		al1.add("Dhawan");
		al1.add("Bumrah");
		al1.add("Thakur");
		
		System.out.println(al1);
		
		/**
		 * @param al1 : It is the instance of the ArrayList which hold only the Lion type of objects as we have used the generics on it
		 */
		
		ArrayList<Lion> al2 = new ArrayList<Lion>();
		al2.add(l1);
		al2.add(l2);
		al2.add(l3);
		
		System.out.println(al2);
		
		/**
		 * @param al3 : It is the instance of the ArrayList which hold only the Integer type of data as we have used the generics on it
		 */
		ArrayList<Integer> al3 = new ArrayList<Integer>();
		al3.add(10);
		al3.add(20);
		al3.add(30);
		al3.add(40);
		al3.add(50);
		
		System.out.println(al3);
	}

}
