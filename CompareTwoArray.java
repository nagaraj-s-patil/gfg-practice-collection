package com;

import java.util.ArrayList;

public class CompareTwoArray {
	public static void main(String[] args) {
		
		ArrayList<Integer> al1=new ArrayList<Integer>();
		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add(40);
		
		ArrayList<Integer> al2=new ArrayList<Integer>();
		al2.add(10);
		al2.add(20);
		al2.add(30);
		al2.add(40);
		
		System.out.println(al1);
		System.out.println(al2);
		if(al1.equals(al2)) {
			System.out.println("List both are equals");
		}
		else
			System.out.println("list both are not equals");
	}
}
