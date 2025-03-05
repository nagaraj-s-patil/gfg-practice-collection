package com;

import java.util.LinkedList;

public class SizeofCollection {
	public static void main(String[] args) {
		
		LinkedList<String> ll=new LinkedList<String>();
		
		ll.add("Geeks");
		ll.add("For");
		ll.add("Geeks");
	
	System.out.println(ll);
	
	System.out.println("Size Of ll is "+ll.size());
	}
}
