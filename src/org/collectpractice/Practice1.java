package org.collectpractice;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Practice1 {

	public static void main(String[] args) {
		
		Vector<String> v = new Vector<String>();
		v.add("1");
		v.add("2");
		v.add("3");
		v.add("4");
		v.add("5");
		
//		Enumeration<String> elements = v.elements();
//		while (elements.hasMoreElements()) {
//			String string = (String) elements.nextElement();
//			System.out.println(string);
//		}
		
//		Iterator<String> iterator = v.iterator();
//		while (iterator.hasNext()) {
//			String string = (String) iterator.next();
//			if (string.equals("1")) {
//				iterator.remove();
//			}
//		}
//		System.out.println(v);
		ListIterator<String> listIterator = v.listIterator();
		while (listIterator.hasNext()) {
			String string = (String) listIterator.next();
			if (string.equals("2")) {
				listIterator.add("7");
			}
			else if (string.equals("5")) {
				listIterator.set("9");
				
			}
			else if (string.equals("1")) {
				listIterator.remove();
			}
		}
		System.out.println(v);
		
		while (listIterator.hasPrevious()) {
			String string = (String) listIterator.previous();
			System.out.println(string);
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
