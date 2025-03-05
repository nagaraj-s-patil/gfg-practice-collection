package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListToSetConversion {

	public static void main(String[] args) {

		List<String> Alist=Arrays.asList("hello","hi","hi","good","afternoon");
		
		System.out.println("list is "+Alist);
		Set<String> hset=new HashSet<String>();
		hset.addAll(Alist);
		System.out.println("set is "+hset); 
	}
}
