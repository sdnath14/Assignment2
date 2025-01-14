import java.util.Scanner;

class Laptop {
    private String brand;
    private double price;
    private String processor;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }
}

public class q5 {
    public static void main(String[] args) {

        Laptop laptop1 = new Laptop();
        laptop1.setBrand("Dell");
        laptop1.setPrice(80000);
        laptop1.setProcessor("Intel Core Ultra i7");

        Laptop laptop2 = new Laptop();
        laptop2.setBrand("HP");
        laptop2.setPrice(75000);
        laptop2.setProcessor("AMD Ryzen 7");

        Laptop laptop3 = new Laptop();
        laptop3.setBrand("Asus");
        laptop3.setPrice(90000);
        laptop3.setProcessor("Intel Core Ultra i9");

        Laptop[] laptops = { laptop1, laptop2, laptop3 };

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String username = sc.nextLine();
        System.out.println("Enter your address:");
        String address = sc.nextLine();

        // Using enhanced for loop
        System.out.println("Available Laptops:");
        for (Laptop laptop : laptops) {
            System.out.println(
                    "Brand: " + laptop.getBrand() + ", Price: " + laptop.getPrice() + ", Processor: "
                            + laptop.getProcessor());
        }

        System.out.println("Enter the brand of the laptop you want to purchase:");
        String chosenBrand = sc.nextLine();

        boolean purchased = false;
        for (Laptop laptop : laptops) {
            if (laptop.getBrand().equalsIgnoreCase(chosenBrand)) {
                if (laptop.getProcessor().toLowerCase().contains("intel core ultra")) {
                    System.out.println("Congratulations, " + username + "! You have purchased the following laptop:");
                    System.out.println("Brand: " + laptop.getBrand() + ", Price: " + laptop.getPrice() + ", Processor: "
                            + laptop.getProcessor());
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
