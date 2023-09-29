package JavaProgrmPract.JavaProgrm;

public class SBandSBStringReversPract 
{
	public static void main(String[] args) 
	{
		StringBuffer str = new StringBuffer("My name is Viren");
		System.out.println("The string is: " +str);
		System.out.println("The reverse of the string is: " +str.reverse());
		
		StringBuilder str1 = new StringBuilder("Automation engineer");
		System.out.println("The String is: " + str1);
		System.out.println("The reverse of the string is: " +str1.reverse());
	}
}
