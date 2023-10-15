package com.jsp.p1;

public class MiddleStringrev {
	public static void main(String[] args) {
		String s="java is very easy";
		char[] c=s.toCharArray();
		String s1="",s2="",s3="";
		int i=0,j=c.length-1;
		while(c[i] !=' ') {
			s1+=c[i];
			i++;
		}
		while(c[j] != ' ') j--;
		for(int m=j+1;m<s.length();m++) s2+=c[m];
		i++;
		String s4="";
		while(i<=j){
			if(c[i] != ' '){
				s4+=c[i];
				i++;
			}
			else{
				s3+=rev(s4)+" ";
				s4="";
				i++;		
			}
		}
		System.out.println(s1+" "+s3+s2);
	}
	public static String rev(String s){
		String s1="";
		for(int i=s.length()-1;i>=0;i-- )
			s1+=s.charAt(i);
		return s1;	
	}
}
