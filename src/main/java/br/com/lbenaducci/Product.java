package br.com.lbenaducci;

public abstract class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Método abstrato
    public abstract void displayDetails();

    // Método concreto
    public void applyDiscount(double percentage) {
        this.price -= this.price * (percentage / 100);
        System.out.println("Discount applied. New price: $" + this.price);
    }
}
