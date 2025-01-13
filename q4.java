class LED {
    int id;
    double price;
    String model;

    public LED(int id, double price, String model) {
        this.id = id;
        this.model = model;
        this.price = price;
    }

    void display() {
        System.out.println("model:" + model + "id:" + id + "price:" + price);
    }

}

public class q4 {
    public static void main(String[] args) {
        LED model1 = new LED(001, 40000, "Sony");
        LED model2 = new LED(003, 50000, "Samsung");

        if (model1.price > model2.price) {
            model1.model = "Sony Premium Tv";
        } else {
            model2.model = "Samsung Premium Tv";
        }

        model1.display();
        model2.display();

    }

}
