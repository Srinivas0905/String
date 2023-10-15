package com.jsp.p1;

public class LenOfWordInString {

	public static void main(String[] args) {
		String s="java is easy";
		String s1="";
		int i=0;
		int count=0;
		while(i<s.length())
		{
			if(s.charAt(i) != ' ' || i==s.length()-1)
			{
				s1+=s.charAt(i);
				count++;
				i++;
			}
			else
			{
				System.out.println(s1+"->"+count);
				count=0;
				s1="";
				i++;
			}
			
		}
		System.out.println(s1+"->"+count);

	}

}
