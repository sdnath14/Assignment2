import java.util.Scanner;

class MobileShop {
    private int versionAndroid;

    public int getVersionAndroid() {
        return versionAndroid;
    }

    public void setVersionAndroid(int versionAndroid) {
        this.versionAndroid = versionAndroid;
    }

    public void checkAvailability() {
        if (versionAndroid == 15) {
            System.out.println("I will purchase it.");
        } else {
            System.out.println("No thanks!!");
        }
    }
}

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter sir, which model you want?");
        String models = sc.nextLine();

        System.out.println("Which android version you want?");
        int versionAndroid = sc.nextInt();

        MobileShop m = new MobileShop();
        m.setVersionAndroid(versionAndroid);

        m.checkAvailability();
    }
}
