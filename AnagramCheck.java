import java.util.Arrays;
import java.util.Scanner;
public class AnagramCheck
{
public static void main(String[] args)
{
String str1 = "Listen";
String str2= "Silent";
char[] arr1 = str1.toCharArray();
char[] arr2 = str2.toCharArray();
Arrays.sort(arr1);
Arrays.sort(arr2);
if(Arrays.equals(arr1,arr2))
{
System.out.println("Anagram");
}
else
{
System.out.println("Not Anagram");
}
}
}
