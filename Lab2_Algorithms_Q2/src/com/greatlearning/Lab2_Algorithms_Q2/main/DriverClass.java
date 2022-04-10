package com.greatlearning.Lab2_Algorithms_Q2.main;
import java.util.Arrays;
import java.util.Scanner;
import com.greatlearning.Lab2_Algorithms_Q2.utility.Denominations;



public class DriverClass
{

	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of currency denominations");
		int size=sc.nextInt();
		
		int array[]=new int [size];
		int count[]=new int[size];
		
		System.out.println("Enter the currency denominations value");
		for(int i=0;i<size;i++)
		{
		  array[i]=sc.nextInt();
		}
		
		Denominations.mergeSort(array, 0, array.length-1);
		
		System.out.println("Enter the amount you want to pay");
		int amount =sc.nextInt();
		
		System.out.println();
		
		int amountRemaining=Denominations.minDenominations(array,count,amount);
		
		if(amountRemaining>0)
		{
		 System.out.println("Payment can't be made with the given denominations");
		 return;
		}
		
		System.out.println("Your payment approach in order to give min no of notes will be");
		
		for(int i=array.length-1;i>=0;i--)
		{
			
			if(count[i]>0)
			{
			System.out.println(array[i]+":"+count[i]);
		    }
		}
		
	}

	
	
}
	


