package com.jsp.p1;

import java.util.Scanner;
import java.util.Map;
import java.util.LinkedHashMap;

public class Strings_TO_Digits2 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the String");
		String s=scn.nextLine();
		String[] s2=s.split(" ");
		
		Map<String,Integer> m=new LinkedHashMap<String,Integer>();
		m.put("zero", 0);
		m.put("one", 1);
		m.put("two", 2);
		m.put("three", 3);
		m.put("four", 4);
		m.put("five", 5);
		m.put("six", 6);
		m.put("seven", 7);
		m.put("eight",8);
		m.put("nine", 9);
		
		String s1="";
		for(int i=0;i<s2.length;i++) s1+=m.get(s2[i]);
		System.out.println(s1);
		

	}

}
