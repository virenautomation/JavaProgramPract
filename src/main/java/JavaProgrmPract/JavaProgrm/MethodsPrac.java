package JavaProgrmPract.JavaProgrm;

public class MethodsPrac 
	{
		public static void name(String name)
		{
			System.out.println(name);
		}
		
		static void fullName(String fname, String lname)
		{
			System.out.println(fname + " " + lname);
		}
		
		static void calculation(int x, int y)
		{
			int a = x+y;
			System.out.println(a);
		}
		
		static int outingPlan(int x, int y)
		{
			return y+x;
		}
		
		static int capital(int p)
		{
			return p+80;
		}
		
		static void ageCheck(int age)
		{
			if(age>20)
			{
				System.out.println("You are adult");
			}
			else
			{
				System.out.println("You are too small to continue");
			}
		}
		
		public static void main(String[] args) 
		{
//			MethodsPrac obj = new MethodsPrac();
			name("Virender");
			fullName("Virender", "Kumar");
			calculation(10 , 20);
			ageCheck(18);
			System.out.println(capital(20));
			int z = outingPlan(55, 35);
			System.out.println(z);
		}
}
