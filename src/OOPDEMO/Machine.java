package OOPDEMO;
public class Machine {
    // Private memebers
    private String brand;
    private String model;
    private double price;
    private String description;
    // Default constructor
    public Machine() {
    }



    // Parameterized constructor
    public Machine(String brand, String model, double price, String description) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.description = description;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription() {
        this.description = description;
    }    // Method to display the machine details
    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
        System.out.println("Description: " + description);
    }
}

