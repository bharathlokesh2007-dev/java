import java.util.*;

class StrMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value:");
        String val = sc.nextLine();

        System.out.println("Length: " + val.length());
        System.out.println("String: " + val);
        System.out.println("charAt(5): " + val.charAt(5));
        System.out.println("UPPER CASE: " + val.toUpperCase());
        System.out.println("LOWER CASE: " + val.toLowerCase());
        System.out.println("Substring(2,6): " + val.substring(2, 6));
        System.out.println("Equal: " + val.equals("Test"));
        System.out.println("Starts with: " + val.startsWith("Abhi"));
        System.out.println("Ends with: " + val.endsWith("Lash"));
        System.out.println("Equals Ignore Case: " + val.equalsIgnoreCase("GUM GUM"));
        System.out.println("Compare: " + val.compareTo("lash"));
    }
}