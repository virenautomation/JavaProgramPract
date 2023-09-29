package JavaProgrmPract.JavaProgrm;

import java.util.Scanner;

public class MissingNoPract 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n Number:" );
		int n = sc.nextInt();
		
		int ArrayInput[] = new int[n];
		System.out.println("Enter second (n-1) Nnumber:");
		
		for (int i = 0; i<=n-2; i++)
			ArrayInput[i] = sc.nextInt();
	}
    	int sumOfAll = (n*(n+1))/2;
    	int sumOfArray = 0;
    	for(int i=0; i<=n-2; i++) 
		{
		sumOfArray = sumOfArray+ArrayInput[i];
		}
		int missingNumber = sumOfAll-sumOfArray;
		System.out.println("Missing number is: "+missingNumber);
}
		}
