import java.util.Scanner;
class Vowel
{
	public static void main(String[] args)
	{
		Scanner d = new Scanner(System.in);
		System.out.println("Enter a word:");
		String strob = d.nextLine();
		
		int digit = 0;
		strob = strob.toLowerCase();
		for(int i =0; i < strob.length();i++)
		{
			char ch = strob.charAt(i);
			if ("0123456789".indexOf(ch) != -1)
                		digit++;
            	}
		System.out.println(" Total digits you have entered are:"+digit);
	}
}