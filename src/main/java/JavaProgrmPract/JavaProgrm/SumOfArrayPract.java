package JavaProgrmPract.JavaProgrm;

import java.util.Scanner;

public class SumOfArrayPract 
{
	public static void main(String[] args) 
	{
		//int[] arr = {12,13,14,15,16};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lenth of array no.");
		
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Please enter the " +size +" element in array:");
		
		for(int i = 1; i < size; i++)
		{	
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		for(int i = 0; i < arr.length; i++)
		{
			sum = sum +arr[i];
		}
			System.out.println(sum);	
	}
}
