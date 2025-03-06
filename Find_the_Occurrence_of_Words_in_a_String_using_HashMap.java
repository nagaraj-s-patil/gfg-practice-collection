package com;

import java.util.HashMap;
import java.io.*;
import java.util.Map;

public class Find_the_Occurrence_of_Words_in_a_String_using_HashMap {

	public static void main(String[] args) {

		String str="Alice is girl and Bob is boy";

		Map<String, Integer> hmap=new HashMap<String, Integer>();

		String[] words=str.split(" ");

		for(String word :words) {

			if(hmap.containsKey(word)) {

				hmap.put(word, hmap.get(word)+1);				
			}
			else {
				hmap.put(word, 1);
			}
		}
		System.out.println(hmap);
	}
	
}
