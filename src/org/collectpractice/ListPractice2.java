package org.collectpractice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListPractice2 {
	
	public static void main(String[] args) {
	
	
	List li = new ArrayList();
	
	li.add(10);
	li.add(1234);
	li.add(987654376576l);
	li.add("SGR");
	li.add(true);
	li.add(25000.123);
	li.add(false);
	li.add('G');
	li.add(null);

	int size = li.size();
	System.out.println(size);
	
	Object object = li.get(3);
	System.out.println(object);
	
	Object remove = li.remove(7);
	System.out.println(remove);
	
	li.add(3,false);
	System.out.println(li);
	
	li.set(5, 6694);
	System.out.println(li);
	
	boolean contains = li.contains(6694);
	System.out.println(contains);
	
	li.clear();
	System.out.println(li);
	
	int indexOf = li.indexOf(10);
	System.out.println(indexOf);
	
	int lastIndexOf = li.lastIndexOf(1234);
	System.out.println(lastIndexOf);
	
	List l1 = new ArrayList();
	
	l1.add("SG");
	l1.add(true);
	l1.add(7);
	
	
	List l2 = new ArrayList();
	
	l2.add("SR");
	l2.add(7);
	l2.add(false);
	
	l1.removeAll(l2);
	System.out.println(l1);
	
	l1.retainAll(l2);
	System.out.println(l1);
	
	List x = new LinkedList();
	
	x.addAll(l2);
	System.out.println(x);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			

}
}