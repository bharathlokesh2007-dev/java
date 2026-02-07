import java.util.*;

public class Details {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:");
        String n = sc.nextLine();

        System.out.println("Enter your age:");
        int e = sc.nextInt();
        sc.nextLine(); // consume the leftover newline

        System.out.println("Enter your status:");
        String r = sc.nextLine();

        System.out.println("Name: " + n);
        System.out.println("Age: " + e);
        System.out.println("Status: " + r);
    }
}