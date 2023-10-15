package com.jsp.p1;

public class Each_Char_Occ {

	public static void main(String[] args) {
		String s="banana";
		
		while(s.length()>0) 
		{
			char c=s.charAt(0);
			String s1=remove(c,s);
			System.out.println(c+" "+(s.length()-s1.length()));
			s=s1;
		}
	}
	public static String remove(char c,String s)
	{
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			char c1=s.charAt(i);
			if(c!=c1) s1+=c1;
		}
		return s1;
	}
}
