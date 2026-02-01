import java.util.Scanner;
class VowelCount
{
	public static void main(String[] args)
	{
		Scanner d = new Scanner(System.in);
		System.out.println("Enter a word:");
		String str = d.nextLine();
		
		int vowels = 0, consonants = 0, space = 0, digit = 0;
		str = str.toLowerCase();
		for(int i =0; i < str.length();i++)
		{
			char ch = str.charAt(i);
			if("aeiou".indexOf(ch)!= -1)
			{
				vowels++;
			}
			else if(ch >= 'a'&& ch <= 'z')
			{
				consonants++;
			}
			else if (ch >= '0' && ch <= '9')
                		digit++;
            		else if (ch == ' ')
                		space++;
		}
		System.out.println("Vowels:"+vowels);
		System.out.println("consonants:"+consonants);
		System.out.println("Space:"+space);
		System.out.println("digit:"+digit);
	}
}