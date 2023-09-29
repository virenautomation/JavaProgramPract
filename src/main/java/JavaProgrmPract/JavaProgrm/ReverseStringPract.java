package JavaProgrmPract.JavaProgrm;

public class ReverseStringPract 
{
	public static void main(String[] args) 
	{
		String name = "viren";
		String rname = "";
		char ch;

		for(int i=0; i<name.length(); i++)
		{
			ch = name.charAt(i);
			rname = ch+rname;
		}
		System.out.println("The reverse name is: " +rname);
	}
}
