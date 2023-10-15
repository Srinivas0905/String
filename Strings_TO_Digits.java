package com.jsp.p1;

import java.util.Arrays;
import java.util.Scanner;

public class Strings_TO_Digits {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the String");
		String s=scn.nextLine();
		String[] s1=s.split(" ");
		
		String s3="";
		for(int i=0;i<s1.length;i++)
		{
			String s2=s1[i];
			if(s2.equals("one"))
				s3+=1;
			else if(s2.equals("two"))
				s3+=2;
			else if(s2.equals("three"))
				s3+=3;
			else if(s2.equals("four"))
				s3+=4;
			else if(s2.equals("five"))
				s3+=5;
			else if(s2.equals("six"))
				s3+=6;
			else if(s2.equals("seven"))
				s3+=7;
			
			else if(s2.equals("eight"))
				s3+=8;
			else if(s2.equals("nine"))
				s3+=9;
		}
		System.out.println(s3);
	}

}
