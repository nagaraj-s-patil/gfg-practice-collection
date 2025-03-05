package com;

import java.util.Iterator;
import java.util.LinkedList;

public class IterateLinkedList {
	public static void main(String[] args) {
		LinkedList<Integer> linkedlist=new LinkedList<Integer>();
		linkedlist.add(11);
		linkedlist.add(20);
		linkedlist.add(60);
		linkedlist.add(70);
		
		iterationUsingIterat(linkedlist);
	}
	public static void iterationUsingIterat(LinkedList<Integer> ll) {
		
		Iterator it=ll.iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		
	}

}
