package com;

import java.util.ArrayList;
import java.util.List;

public class AddAnElementInJavaArrayList {
	public static void main(String[] args) {
		
		List<Character> al=new ArrayList<Character>();
		
		al.add('a');
		al.add('b');
		al.add('c');
		
		System.out.println(al);
		
		//remove an element
		System.out.println(al.remove(1));
		System.out.println(al);
	}
}
