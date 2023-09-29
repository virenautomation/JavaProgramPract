package JavaProgrmPract.JavaProgrm;

public class AllAlphabetsPract 
{
	public static void main(String[] args) 
	{
		char ch;
		
		//This variable is used to show the ASCII value of upper case Alphabets.
		int Num;
		
		//For printing upper case/lower case Alphabets, we need to change the ch value to A and Z to a and z respectively. 
		for(ch='A'; ch<='Z'; ch++)
		{
			Num = ch;
			System.out.println(ch +" " +Num);
		}
	}
}
