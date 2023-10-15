package com.jsp.p1;
import java.util.Arrays;

public class Each_Word_Reverse {
	public static void main(String[] args) {
		String s="java is easy",s4="";
		String[] s1=seperate(s);
		System.out.println(Arrays.toString(seperate(s)));
		for(int i=0;i<s1.length;i++)
		{
			String s2=s1[i];
			if(s2!=null) 
			{
	 			String s3="";
				for(int j=s2.length()-1;j>=0;j--) s3+=s2.charAt(j);
				s4=s4+s3+" ";
			}
		}
		System.out.println(s4);
	}
	public static String[] seperate(String s)
	{
		String s1[]=new String[s.length()];
		String s2="";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c!=' ') s2+=c;
			else
			{
				s1[count++]=s2;
				s2="";
			}
			if(i == s.length()-1)	s1[count]=s2;
		}
		return s1;
	}
}
