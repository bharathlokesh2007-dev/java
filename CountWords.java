import java.util.*;
public class CountWords
{
public static void main(String[] args)
{
Scanner a = new Scanner(System.in);
System.out.println("Enter the Word:");
String str = a.nextLine();
String[] Words = str.split(" ");
System.out.println("Number of words" + Words.length);
}
}
