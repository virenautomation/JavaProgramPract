package JavaProgrmPract.JavaProgrm;

public class SwapNumber 
{
	public static void main(String[] args) 
	{
		int num1 = 10;
		int num2 = 20;
		int temp = num1;
		System.out.println("The value of Num1 is: " +num1);
		System.out.println("The value of Num2 is: " +num2);
		
		num1 = num2;
		num2 = temp;
		
		System.out.println("The value of Num1 is: " +num1);
		System.out.println("The value of Num2 is: " +num2);
	}
}
