package JavaProgrmPract.JavaProgrm;

public class SwapNoWithoutTemp 
{
	public static void main(String[] args) 
	{
		int num1 = 45;
		int num2 = 30;
		
		num1 = num1 + num2; //75
		num2 = num1 - num2; //45
		num1 = num1 - num2; //30
		System.out.println("The value of num1 is: " +num1);
		System.out.println("The value of num2 is: " +num2);
	}
}
		
