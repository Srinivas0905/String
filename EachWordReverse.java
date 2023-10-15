package com.jsp.p1;

import java.util.ArrayList;

public class EachWordReverse {

	public static void main(String[] args) {
		String s="java is easy";
		String s2="";
		char[] c=s.toCharArray();
		int i=0,j=0;
		
		while(i<s.length())
		{
			
			while(j<s.length() && c[j]!=' ') j++;
			int k=j-1;
			String s1="";
			while(k>=i)
			{
				s1+=c[k];
				k--;
			}
			s2+=s1;
			if(j<s.length()-1)
				s2+=" ";
			j++;
			i=j;
		}
		System.out.println(s2);
		
		
	}

}
