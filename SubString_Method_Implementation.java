package com.jsp.p1;

public class SubString_Method_Implementation {

	public static void main(String[] args) {
		String s="malayalam";
		substr(s);

	}
	public static void substr(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			String s1="";
			for(int j=0;j<=s.length();j++)
			{
				if(j<=i)
				{
					s1+=s.charAt(j);
				}
			}
		}
		
	}

}
