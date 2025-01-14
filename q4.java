class LED {
    private int id;
    private double price;
    private String model;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    void display() {
        System.out.println("Model: " + model + ", ID: " + id + ", Price: " + price);
    }
}

public class q4 {
    public static void main(String[] args) {
        LED model1 = new LED();
        model1.setId(1);
        model1.setPrice(40000);
        model1.setModel("Sony");

        LED model2 = new LED();
        model2.setId(3);
        model2.setPrice(50000);
        model2.setModel("Samsung");

        if (model1.getPrice() > model2.getPrice()) {
            model1.setModel("Sony Premium Tv");
        } else {
            model2.setModel("Samsung Premium Tv");
        }

        model1.display();
        model2.display();
    }
}

