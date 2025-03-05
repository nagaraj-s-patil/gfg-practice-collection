package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ConvertArrayToArrayList {
	public static void main(String[] args) {

		String[] array= {"Nagu","Mallu","banu"};

		List al=Arrays.asList(array);
		System.out.println(al);

		String[] student= {"ramu","raju","kavitha"};

		List<String> ll=new ArrayList<String>();

		Collections.addAll(ll, student);

		System.out.println(ll);


	}
}
