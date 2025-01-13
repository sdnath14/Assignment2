import java.util.Scanner;

class MobileShop {
    public void checkitavailable(int versionandroid) {
        if (versionandroid == 15) {
            System.out.println("I will purchase it.");
        } else {
            System.out.println("No thanks!!");
        }
    }

}

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String models;
        int versionandroid;
        System.out.println("Enter sir which model you want?");
        System.out.println("Which android version you want?");
        models = sc.nextLine();
        versionandroid = sc.nextInt();
        MobileShop m = new MobileShop();
        m.checkitavailable(versionandroid);

    }

}
