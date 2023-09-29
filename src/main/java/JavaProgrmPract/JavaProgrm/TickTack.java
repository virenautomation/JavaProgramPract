package JavaProgrmPract.JavaProgrm;

public class TickTack 
{
public static void main(String[] args) 
{
	int n = 100;
	for (int i=1; i<=n; i++)
	{
		if(i%15==0)
			System.out.println("TickTack"+ " ");
		
		else if(i%5==0)
		System.out.println("Tick"+ " ");
		
		else if(i%3==0)
		System.out.println("Tack"+ " ");
		
		else
			System.out.println(i+" ");
		
		}
	}
}

