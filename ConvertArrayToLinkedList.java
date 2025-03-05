package com;

import java.util.ArrayList;
import java.util.LinkedList;

public class ConvertArrayToLinkedList {
	public static void main(String[] args) {
		
		int[] intArray= {10,20,20,30,40};
		
		LinkedList<Integer> ll=new LinkedList<Integer>();
		
		for(int i :intArray) {
			ll.add(i);
		}
		System.out.println(ll);
		
		
		
	}
}
