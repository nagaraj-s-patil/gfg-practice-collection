package com;

import java.util.HashMap;
import java.util.Map;

public class print_all_duplicate_characters {

	public static void duplicate_Char(String str) {
		
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		
		char[] charArray=str.toCharArray();
		
		for(char c :charArray) {
			
			if(map.containsKey(c)) {
				
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c, 1);
			}
		}
		
		System.out.println(map);
		
		for(Map.Entry<Character, Integer> entry :map.entrySet()) {
			
			if(entry.getValue()>1) {
				
				System.out.println(entry.getKey()+" "+entry.getValue());
			}
		}
	}
	public static void main(String[] args) {
		
		String str="GeeksForGeeks";
		
		duplicate_Char(str);
	}
}
