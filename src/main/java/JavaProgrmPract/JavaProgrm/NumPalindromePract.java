package JavaProgrmPract.JavaProgrm;

public class NumPalindromePract 
{
	public static void main(String[] args) 
	{
		int num = 121;
		int Onum = num;
		int rnum = 0;
		
		while (num != 0)
		{
			// '%' this sign gives the last number(remainder) of a value
			int digit = num % 10;     //1 //2 //1
			rnum = rnum * 10 + digit; //1 //12//121
			
			//'/' this sign leaves the last number of a value
			num = num/10;             //12//1 //0  
		}
		System.out.println(Onum);
		
	if(Onum==rnum)
	{
		System.out.println("The Reverse number is palindrome of actual Number i.e.,: " +rnum);
	}
	else
	{
		System.out.println("The Reverse number is not palindrome of actual Number: "+Onum +" and " +rnum);
	}
}
}
