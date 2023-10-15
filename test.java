package com.jsp.p1;

import java.util.Arrays;

public class test {

	public static void main(String[] args) {
		String s="banana";
		char[] ch=s.toCharArray();
		int count=3;
		ch[2]=(char)count;
		System.out.println(Arrays.toString(ch));

	}

}
