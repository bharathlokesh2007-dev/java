import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(",");
        int num1 = Integer.parseInt(parts[0].trim());
        int num2 = Integer.parseInt(parts[1].trim());
        System.out.println("You entered: " + num1 + "," + num2);
        int sum = num1 + num2;
        System.out.println("Output = " + sum);
    }
}