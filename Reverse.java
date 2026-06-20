import java.util.*;
class Reverse
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the test case");
		int t = sc.nextInt();
		for(int i = 0;i<t;i++)
		{
			System.out.println("Enter the word");
			String str = sc.nextLine();
			String rev = "";
            for (int j = str.length() - 1; j >= 0; j--)
			 {
                rev += str.charAt(j);
            }
			if(str == rev)
			{
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
		}
	}
}