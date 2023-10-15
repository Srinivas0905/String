package com.jsp.p1;

public class Replace_With_Number {

	public static void main(String[] args) {
		String s="hello world";
		char[] c=s.toCharArray();
		System.out.println(s);
		
		for(int i=0;i<c.length;i++)
		{
			char c1=c[i];
			int count=49;
			for(int j=i+1;j<c.length;j++)
			{
				char c2=c[j];
				if(c1==c2)
				{
					count++;
					c[j]=(char)(count);
				}
			}
			if(count>49 && (c[i]>='a' && c[i]<='z'))
				c[i]=(char)49;
		}
		System.out.println(new String(c));
		

	}

}
