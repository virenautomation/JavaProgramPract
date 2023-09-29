package JavaProgrmPract.JavaProgrm;

import java.util.Arrays;

public class AnagramPract
{
	public static void isAnagram(String str1, String str2)
	{
		String s1 = str1.replaceAll("\\s", " ");
		String s2 = str2.replaceAll("\\s", " ");
		boolean status = true;
		if (str1.length() != str2.length())
		{
			status = false;
		}
		else
		{
			char[] Arrays1 = s1.toLowerCase().toCharArray();
			char[] Arrays2 = s2.toLowerCase().toCharArray();
			Arrays.sort(Arrays1);
			Arrays.sort(Arrays2);
			status = Arrays.equals(Arrays1, Arrays2);
		}
		
		if(status)
		{
			System.out.println(s1 + " and " + s2 + " are anagram");
		}
		else
		{
			System.out.println(s1 + " and " + s2 + " are not anagram");
		}
	}
	public static void main(String[] args) 
	{
		isAnagram("Tomato", "otamot");
		isAnagram("Father in Law", "Brother in Law");
	}
}
