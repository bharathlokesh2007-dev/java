import java.util.*;

class Bool {
    void nigga(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        if (s.equals(rev))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

class Test {
    public static void main(String[] args) {
        Scanner lash = new Scanner(System.in);
        System.out.println("Enter a word:");
        String s = lash.nextLine();
        Bool ob = new Bool();
        ob.nigga(s);
    }
}