package JavaProgrmPract.JavaProgrm;

public class FindingLargrNoInArrayPract 
{
	public static void main(String[] args) 
	{
		int[] arr = {90,199,343,54,566,983};
		int max = arr[0];
		
		for(int i = 1; i < arr.length; i++)
		{
			if(max < arr[i])
			{
				max = arr[i];
			}
		}
		System.out.println("The max number in the array is: " +max);
	}
}
