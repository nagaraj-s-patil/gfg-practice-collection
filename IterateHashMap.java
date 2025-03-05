package com;

import java.util.HashMap;
import java.util.Map;

public class IterateHashMap {
	public static void main(String[] args) {
		
		Map<Integer, String> map=new HashMap<Integer, String>();
		
		map.put(1, "nagu");
		map.put(2, "mallu");
		map.put(3, "sanket");
		map.put(4, "vilash");
		
		System.out.println(map);
		
		for(Map.Entry<Integer, String> set:map.entrySet()) {
			
			System.out.print(set.getKey()+"="+set.getValue()+" ");
		}
		
		map.forEach(
				(key,value)
				-> System.out.println(key+" "+value)
				);
	}

}
