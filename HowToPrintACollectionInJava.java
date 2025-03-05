package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HowToPrintACollectionInJava {

	public static void main(String[] args) {
		
		String[] geeks= {"Rahul","nagu","mallu"};
		
		List<String> al=new ArrayList<String>();
		
		Collections.addAll(al, geeks);
		
		System.out.println(al);
	}
}
