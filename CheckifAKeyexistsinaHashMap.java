package com;

import java.util.HashMap;
import java.util.Map;

public class CheckifAKeyexistsinaHashMap {
	public static void main(String[] args) {
		
		Map<Integer, String> hmap=new HashMap<Integer, String>();
		
		hmap.put(1, "Geeks");
		hmap.put(2, "For");
		hmap.put(3, "Geeks");
		
		int keys=3;
		
		boolean flag=ceckKeyIsExistsOrNot(keys,hmap);
		System.out.println(flag);
	}
	
	public static boolean ceckKeyIsExistsOrNot(int keys,Map<Integer,String> hmap){
		
		for(Map.Entry<Integer, String> set :hmap.entrySet()) {
			
			if(set.getKey()==keys) {
				return true;
			}			
		}
		return false;
	}
}
