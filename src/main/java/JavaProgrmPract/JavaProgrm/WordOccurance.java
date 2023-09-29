package JavaProgrmPract.JavaProgrm;

public class WordOccurance 
{
	public static int occurance(String str, String word)
	{
		String a[] = str.split(" ");
		int count = 0;
		
		for(int i = 0; i<a.length; i++)
		{
			if(word.equals(a[i]))
				count++;
		}
		return count;
	}
	
	public static void main(String[] args) 
	{
		String str = "This is how you would start your day because starting a day is very very important";
		String word =  "day";
		System.out.println(occurance(str, word));
	}
}
