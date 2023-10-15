package com.jsp.p1;

public class Name_In_TriangleForm {

	public static void main(String[] args) {
		String s="i am raju";
		int space=s.length();
		int stars=1;
		
		for(int i=0;i<s.length();i++)
		{
			for(int j=1;j<space;j++)
				System.out.print(" ");
			for(int j=0;j<stars;j++)
			{
				if(j==0 ||j==stars-1)
					System.out.print(s.charAt(i));
				else
					System.out.print(" ");
			}
			stars+=2;
			space--;
			System.out.println();
		}
		System.out.println(s);
	}

}
