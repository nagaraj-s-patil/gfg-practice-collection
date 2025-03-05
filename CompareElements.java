package com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CompareElements {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();


		al.add(3);
		al.add(5);
		al.add(18);
		al.add(4);
		al.add(6);
		
		//minimum in list
		int minimum=Collections.min(al);
		
		//maximum in list
		int maximum=Collections.max(al);
		
		if(minimum ==maximum) {
			System.out.println("all element are same");
		}
		else {
			System.out.println("Minimum is "+minimum);
			System.out.println("Maximum is "+maximum);
		}
		
	}
}
