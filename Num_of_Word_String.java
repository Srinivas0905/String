package com.jsp.p1;

public class Num_of_Word_String {

	public static void main(String[] args) {
		String s="there is a man called raju";
		int count=0;
		for(int i=0;i<s.length();i++)
			if(s.charAt(i)==' ') count++;
		System.out.println(count+1);
	}

}
