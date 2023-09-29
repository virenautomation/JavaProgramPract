package JavaProgrmPract.JavaProgrm;

public class MultiStringPract 
{
	public static void main(String[] args) 
	{
		int a = 10;
		int b = 20;
		String name = "Virender";
		String lastname = "Kumar";
		System.out.println("The length of the name is: " +name.length());
		System.out.println("The name in Capital letter: " +name.toUpperCase());
		System.out.println("The name in Small letter: " +name.toLowerCase());
		System.out.println(name.concat(lastname));
		System.out.println("The position of 'n' character in name is: " +name.indexOf('n'));
		System.out.println(a+b);
		boolean status = a>b;
		System.out.println(status);
		
	}
}
