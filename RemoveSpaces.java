import java.util.Scanner;
public class RemoveSpaces
{
	public static void main(String[] args)
{
Scanner a = new Scanner(System.in);
System.out.println("Enter the word");
String str = a.nextLine();
System.out.println("Enter the word to be removed");
String b = a.nextLine();
String nospaces = str.replaceAll(b,"");
System.out.println("String without:"+nospaces);
}
}