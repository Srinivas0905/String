package com.jsp.p1;

public class String123 {

	public static void main(String[] args) {
		String s="hEllo";
		String s1="hella";
		char c=s.charAt(0);
		char c1=s1.charAt(0);
		
		s=s.replace(c+"",((char)(c-32))+"");
		s1=s1.replace(c1+"",((char)(c1-32))+"");
		System.out.println(s.length()+s1.length());
		if(s.compareTo(s1)>0) {
			System.out.println("YES");
			System.out.println(s1+" "+s);
		}
		else {
			System.out.println("NO");
			System.out.println(s+" "+s1);
		}
	}
}
