package JavaProgrmPract.JavaProgrm;

import java.util.Scanner;

public class FactorialPract 
{
	public static void main(String[] args) 
	{
		//This scanner has been used for user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the factorial Number: ");
		int num = sc.nextInt();
		
		//or we can hard code the number as
		//int num = 10;
		int fact = 1;
		
		for(int i = fact; i <=num; i++)
		{
			fact = fact*i;
			System.out.println("Now the value of 'i' is: " +i);
		}
		System.out.println("And the factorial of " +num +" is: " +fact);
	}
}
