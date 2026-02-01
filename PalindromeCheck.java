import java.util.Scanner;
class PalindromeCheck
{
	public static void main(String[] args)
	{
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the word to heck whether it's palindrome or not:");
		String str = a.nextLine();
		String rev  ="";
		for(int i = str.length() - 1; i >= 0; i--)
		{
			rev += str.charAt(i);
		}
		if(str.equals(rev))
		{
			System.out.println("**************"+str +" is a palindrome****************");
		}
		else
		{
			System.out.println("****************"+str +" is not a palindrome**************");
		}
	}
}