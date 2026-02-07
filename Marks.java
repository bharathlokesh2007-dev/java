import java.util.*;
public class Marks
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of C:");
        int m1 = sc.nextInt();

        System.out.println("Enter marks of Java:");
        int m2 = sc.nextInt();

        System.out.println("Enter marks of Python:");
        int m3 = sc.nextInt();

        // Calculate total and average
        int total = m1 + m2 + m3;
        double average = total / 3.0;
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
    }
}
