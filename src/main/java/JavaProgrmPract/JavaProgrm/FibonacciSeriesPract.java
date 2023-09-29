package JavaProgrmPract.JavaProgrm;

public class FibonacciSeriesPract 
{
	public static void main(String[] args) 
	{
		int num1=0;
		int num2=1;
		int num3;
		int count=10;
//		System.out.println(num1+ " " + num2+ " ");
		
		for(int i=0; i<count; i++)
		{
			num3=num1+num2;
			System.out.print(num3+" ");
			
			num1=num2;
			num2=num3;
		}
	}
}
