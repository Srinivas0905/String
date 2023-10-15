package com.jsp.p1;

public class Max_Occured_Char {

	public static void main(String[] args) {
		String s="nannaa";
		char c=' ';
		int max_occ=1;
		
		for(int i=0;i<s.length();i++)
		{
			int count=0;
			char c1=s.charAt(i);
			
			for(int j=i;j<s.length();j++)
			{
				char c2=s.charAt(j);
				if(c1 == c2)
					count++;
			}
			if(max_occ<count)
			{
				max_occ=count;
				c=c1;
			}
			else if(c>c1)
				c=c1;
		}
		System.out.println(c+" "+max_occ);

	}

}
