package JavaProgrmPract.JavaProgrm;

public class StringPalidromePract 
{
	public static void main(String[] args) 
	{
		String str = "level";
		String rstr = "";
		char ch;
		System.out.println("The value of str is: " +str);
		for(int i=0; i<str.length(); i++)
		{
			ch = str.charAt(i);
			rstr = ch+rstr;
			System.out.println(rstr);
		}
		if(str.equals(rstr))
		{
			System.out.println("The string is Palindrome as str is equals to rstr:" +rstr);
		}
		else
		{
			System.out.println("The string is not Palindrome");
		}
	}
}
