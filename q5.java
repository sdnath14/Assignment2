import java.util.Scanner;

class Laptop {
    String brand;
    double price;
    String processor;

    public Laptop(String brand, double price, String processor) {
        this.brand = brand;
        this.price = price;
        this.processor = processor;
    }
}

public class q5 {
    public static void main(String[] args) {

        Laptop laptop1 = new Laptop("Dell", 80000, "Intel Core Ultra i7");
        Laptop laptop2 = new Laptop("HP", 750000, "AMD Ryzen 7");
        Laptop laptop3 = new Laptop("Asus", 90000, "Intel Core Ultra i9");

        Laptop[] laptops = { laptop1, laptop2, laptop3 };

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String username = sc.nextLine();
        System.out.println("Enter your address:");
        String address = sc.nextLine();

        // using enhancing loop method:
        System.out.println("Available Laptops:");
        for (Laptop laptop : laptops) {
            System.out.println(
                    "Brand: " + laptop.brand + ", Price: " + laptop.price + ", Processor: " + laptop.processor);
        }

        System.out.println("Enter the brand of the laptop you want to purchase:");
        String chosenBrand = sc.nextLine();

        boolean purchased = false;
        for (Laptop laptop : laptops) {
            if (laptop.brand.equalsIgnoreCase(chosenBrand)) {
                if (laptop.processor.toLowerCase().contains("intel core ultra")) {
                    System.out.println("Congratulations, " + username + "! You have purchased the following laptop:");
                    System.out.println("Brand: " + laptop.brand + ", Price: " + laptop.price + ", Processor: "
                            + laptop.processor);
                    purchased = true;
                } else {
                    System.out.println("Sorry, " + username
                            + ". The selected laptop does not have an Intel Core Ultra processor and cannot be purchased.");
                }
                break;
            }
        }

        if (!purchased) {
            System.out.println("The brand you entered is not available in the list.");
        }

    }
}
