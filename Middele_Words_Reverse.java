package com.jsp.p1;
import java.util.Arrays;

public class Middele_Words_Reverse {

	public static void main(String[] args) {
		String s="i am srinivas raju";
		System.out.println(Arrays.toString(split(s)));
		String[] s1=split(s);
		int j=0;
		for(int i=0;i<s1.length;i++)
		{
			String s2=s1[i];
			if(s2==null)
			{
				j=i;
				break;
			}
		}
		String s4="";
		for(int i=1;i<j-1;i++)
		{
			String s2=s1[i],s3="";
			for(int k=s2.length()-1;k>=0;k--) s3+=s2.charAt(k);
			s4+=s3+" ";
		}
		System.out.println(s1[0]+" "+s4+s1[j-1]);
	}
	public static String[] split(String s)
	{
		int count=0;
		String[] s1=new String[s.length()];
		String s2="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c != ' ') s2+=c;
			else
			{
				s1[count++]=s2;
				s2="";
			}
			if(i==s.length()-1) s1[count]=s2;	
		}
		return s1;
	}
}
