package com;

import java.util.ArrayList;

public class program1 {
	String name;
	int Rono;
	
	program1(String name,int Rono){
		this.name=name;
		this.Rono=Rono;
	}
	public String toString() {
		
		return "[Name is "+name+" RoNo is "+Rono+"]";
	}

	public static void main(String[] args) {
		
		ArrayList<program1> al=new ArrayList<program1>();
		
		program1 p=new program1("sanket", 1);
		program1 p2=new program1("rahul", 2);
		program1 p3=new program1("vilash", 3);
		
		al.add(p);
		al.add(p3);
		al.add(p2);

		for (program1 program1 : al) {
			System.out.println(program1);
		}
		
		
	}
}
