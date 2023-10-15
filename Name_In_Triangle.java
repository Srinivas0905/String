package com.jsp.p1;

public class Name_In_Triangle {

	public static void main(String[] args) {
		String s="i love you raju";
		int stars=1;
		for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<stars;j++)
			{
				if(j==0 || j==stars-1 || i==s.length()-1)
					System.out.print(s.charAt(j));
				else
					System.out.print(" ");
			}
			stars++;
			System.out.println();
		}

	}

}
