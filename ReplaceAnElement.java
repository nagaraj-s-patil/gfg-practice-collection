package com;

import java.util.ArrayList;

public class ReplaceAnElement {
	public static void main(String[] args) {
		
			ArrayList<Character> al=new ArrayList<Character>();
			al.add('a');
			al.add('b');
			al.add('c');
			al.add('d');
			
			System.out.println(al);
			al.set(2, 'e');
			System.out.println(al);
	}
}
