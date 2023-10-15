package com.jsp.p1;

import java.util.Arrays;

public class Remove_Duplicates {

	public static void main(String[] args) {
		int[] a= {5,4,7,2,8,2,5,4,6,5};
		
		sort(a);
		System.out.println(Arrays.toString(a));

	}
	public static void sort(int[] a)
	{
		
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					
					for(int k=j;k<a.length-1;k++)
						a[k]=a[k+1];
				}
			}
		}
		
	}

}
