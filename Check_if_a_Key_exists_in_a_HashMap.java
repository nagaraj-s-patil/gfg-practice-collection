package com;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Check_if_a_Key_exists_in_a_HashMap {

	public static void main(String[] args) {
		Map<Integer, String> hmap=new HashMap<Integer, String>();
		hmap.put(1, "Geeks");
		hmap.put(2, "For");
		hmap.put(3, "Geeks");
		
		Integer key=10;
		boolean flag=checkValue(key,hmap);
		
		System.out.println(flag);
		
	}
	
	public static boolean checkValue(Integer key,Map<Integer, String> hmap) {
		for (Entry<Integer, String> set : hmap.entrySet()) {

			if(key==set.getKey()) {
				return true;
			}			
		}
		return false;
	}
}
