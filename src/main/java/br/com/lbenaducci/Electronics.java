package br.com.lbenaducci;

public final class Electronics extends PhysicalProduct {
    private String brand;

    public Electronics(String name, double price, Dimensions dimensions, double weight, String brand) {
        super(name, price, dimensions, weight);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Brand: " + brand);
    }
}