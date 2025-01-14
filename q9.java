import java.util.Scanner;

class Palindrome {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void checkPalindrome() {
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
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a name:");
        String inputName = sc.nextLine();

        Palindrome p = new Palindrome();
        p.setName(inputName);

        p.checkPalindrome();
    }
}
