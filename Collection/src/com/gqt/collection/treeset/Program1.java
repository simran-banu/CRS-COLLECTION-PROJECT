/**
 * 
 */
package com.gqt.collection.treeset;
import java.util.TreeSet;
/**
 * @author GQT-Trainer
 *
 */
public class Program1 {

	/**
	 * @param args : it is a String type array passed as a parameter to 
	 * the main method
	 * @param ts : it is an instance of TreeSet
	 * @param ts1 : it is an instance of TreeSet
	 * description : To understand adding and removing the data from the treeset
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
		
		System.out.println(ts);//25, 50, 75, 100, 125, 150, 175
		
		TreeSet ts1 = new TreeSet();
		ts1.add(50);//present in ts
		ts1.add(125);//present in ts
		ts1.add(75);//present in ts
		ts1.add(200);
		ts1.add(150);//present in ts
		ts1.add(300);
		ts1.add(175);//present in ts
		
		System.out.println(ts1);//50, 75, 125, 150, 175, 200, 300
		
		ts.addAll(ts1);
		
		System.out.println(ts);//25, 50, 75, 100, 125, 150, 175, 200, 300
		
		ts.remove(200);//25, 50, 75, 100, 125, 150, 175, 300
		System.out.println(ts);
		ts.removeAll(ts1);//25, 100
		System.out.println(ts);
	}

}
