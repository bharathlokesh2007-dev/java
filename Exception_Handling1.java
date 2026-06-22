
import java.util.Scanner;

public class Exception_Handling1 {
    public static void main(String[] args)
    {
        Scanner get = new Scanner(System.in);
        System.out.println("ENter your age: ");
        int age = get.nextInt();
        if(age < 18)
        {
            throw new ArithmeticException("Not eligible to vote");
        }
        System.out.println("Eligible to vote");
    }
}
