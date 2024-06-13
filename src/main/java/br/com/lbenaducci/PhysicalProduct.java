package br.com.lbenaducci;

public sealed class PhysicalProduct extends Product permits Book, Electronics {
    private Dimensions dimensions;
    private double weight;

    public PhysicalProduct(String name, double price, Dimensions dimensions, double weight) {
        super(name, price);
        this.dimensions = dimensions;
        this.weight = weight;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public void displayDetails() {
        System.out.println("Product: " + getName() + " - Price: $" + getPrice());
        System.out.println("Dimensions: " + dimensions + " - Weight: " + weight + "kg");
    }
}