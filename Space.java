import java.util.Scanner;
class Space
{
	public static void main(String[] args)
	{
		Scanner d = new Scanner(System.in);
		System.out.println("Enter a word:");
		String strob = d.nextLine();
		
		int space = 0;
		strob = strob.toLowerCase();
		for(int i =0; i < strob.length();i++)
		{
			char ch = strob.charAt(i);
			if(ch == ' '){
                		space++;
            	}
		}
		System.out.println(" Total space in the sentence are:"+space);
	}
}