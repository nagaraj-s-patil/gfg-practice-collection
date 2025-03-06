package com;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Copy_One_HashMap_to_Another_HashMap {


	public static void main(String[] args) {

		Map<Character, Integer> hmap=new HashMap<Character, Integer>();

		hmap.put('A', 1);
		hmap.put('B', 2);
		hmap.put('c', 3);


		Map<Character, Integer>	secondMap=copyMap(hmap);

		System.out.println(secondMap);
	}
	public static <K,V> Map<K, V> copyMap(Map<K, V> original){

		Map<K, V> copy=new HashMap<K, V>();

		for(Map.Entry<K, V> entry: original.entrySet()) {

			copy.put(entry.getKey(), entry.getValue());
		}


		return copy;
	}


}
