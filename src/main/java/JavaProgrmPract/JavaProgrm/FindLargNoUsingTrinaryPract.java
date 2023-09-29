package JavaProgrmPract.JavaProgrm;

public class FindLargNoUsingTrinaryPract
{
	public static void main(String[] args) 
	{
		int a = 11;
		int b = 22;
		int c = 21;
		 
		//This is the expression of trinary operator
		//'?' expression checks the (a>b) condition and if not true then it will assign the largest number among both(a and b) to the variable.
		int temp = (a>b) ? a : b;
		//This line will also do the same as above.
		int temp1 = (temp>c) ? temp : c;
		
		System.out.println(temp1);
	}
}
