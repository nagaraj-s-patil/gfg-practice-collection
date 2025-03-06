package com;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Convert_HashMap_to_TreeMap {
	public static void main(String[] args) {
		
		Map<Integer, String> hashmap=new HashMap<Integer, String>();
		
		hashmap.put(1, "king");
		hashmap.put(2, "quean");
		hashmap.put(3, "bahubali");
		System.out.println(hashmap);
		Map<Integer, String> treemap=new TreeMap<Integer, String>();
		treemap.putAll(hashmap);
		System.out.println(treemap);
	}
}
