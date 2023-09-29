package JavaProgrmPract.JavaProgrm;

public class FindMultiplePract 
{
	static void FindMulti(int n)
	{
		for(int i = 0; i<=n ; i++)
			if(i%3==0)
				System.out.println(i);
}
	public static void main(String[] args) 
	{
		FindMulti(100);
}
}
	