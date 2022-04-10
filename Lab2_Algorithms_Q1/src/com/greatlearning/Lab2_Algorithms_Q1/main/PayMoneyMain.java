package com.greatlearning.Lab2_Algorithms_Q1.main;

import java.util.Scanner;

public class PayMoneyMain 
{

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of transaction array");
		
		int size=sc.nextInt();
		
		int[] array=new int[size];
		
		System.out.println("Enter the values of array");
		
		for(int i=0;i<size;i++)
		{
			array[i]=sc.nextInt();
		}
		
		System.out.println("Enter the total no of targets that needs to be achieved");
		
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			
			System.out.println("Enter the value of target"+(i+1));
			
			int target=sc.nextInt();
			
			int noOfTransaction=payMoneyTransaction(array, target);
			
			if(noOfTransaction==-1)
			{
			 System.out.println("Target is not achieved");
			}
			
			else
			{
			 System.out.println("Target achieved after "+noOfTransaction+ " transactions");
			 System.out.println();
			}
		
		
	      }

     }

	public static int payMoneyTransaction(int[] array, int target) 
	{
        int sum=0;
		
		for (int i=0;i<array.length;i++ )
			{
			    sum+=array[i];
			    
			    if(sum>=target)
			    {
			     return i+1;
			    }
			}
		
		return -1;
		
	}

}
