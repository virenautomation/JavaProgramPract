package JavaProgrmPract.JavaProgrm;

public class CountNoOfDigit 
{
	public static void main(String[] args) 
	{
		int num = 1231232342;
		int count = 0;
		System.out.println("The number is: " +num);
		while(num != 0)
		{
			num = num/10;
			count++;
		}
		System.out.println("The total count of number are = " +count);
	}
}
