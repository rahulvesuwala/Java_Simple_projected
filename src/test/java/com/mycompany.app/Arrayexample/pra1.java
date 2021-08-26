package com.mycompany.app.Arrayexample;

import java.util.Scanner;

public class pra1
{
    public static void main(String[] args) 
    {
      	Scanner s = new Scanner(System.in);
		System.out.println("Enter the length of long array");
		int length = s.nextInt();
		long long_array[] = new long[length];
		long sum=0;
		System.out.println("Enter the elements of long array");
		for(int i=0; i < length; i++)
		{
			long_array[i] = s.nextLong();
			sum=sum+long_array[i];	
		}
		  System.out.println(sum);  
}
}