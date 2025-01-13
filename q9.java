import java.util.Scanner;

class Palindrome {
    public void checkPel(String name) {
        String reversed = "";

        for (int i = name.length() - 1; i >= 0; i--) {
            reversed += name.charAt(i);
        }

        if (name.equals(reversed)) {
            System.out.println(name + " is a palindrome.");
        } else {
            System.out.println(name + " is not a palindrome.");
        }
    }
}

public class q9 {
    public static void main(String[] args) {
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a name:");
        name = sc.nextLine();

        Palindrome p = new Palindrome();

        p.checkPel(name);

    }
}
