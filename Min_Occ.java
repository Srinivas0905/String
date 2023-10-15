package com.jsp.p1;

public class Min_Occ {

	public static void main(String[] args) {
		String s="abbcccdfffddda";
		int min=s.length();
		char c=' ';
		while(s.length()>0)
		{
			int count=0;
			for(int j=0;j<s.length();j++) if(s.charAt(0)==s.charAt(j)) count++;
			if(count<min)
			{
				min=count;
				c=s.charAt(0);
			}
			s=replace(s,s.charAt(0));
		}
		System.out.println(c+" "+min);
	}
	public static String replace(String s,char c)
	{
		String s1="";
		for(int i=0;i<s.length();i++) if(c != s.charAt(i)) s1+=s.charAt(i);
		return s1;	
	}
}
