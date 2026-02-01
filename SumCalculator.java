import java.util.Scanner;
public class SumCalculator
{
	public static void main(String args[])
{
		Scanner nigga = new Scanner(System.in);
		String input = nigga.nextLine();
		String[] parts = input.split(",");
		int a = Integer.parseInt(parts[0].trim());
		int b = Integer.parseInt(parts[1].trim());
		int c = a + b;
		System.out.println(c);
}
}