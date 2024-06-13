package br.com.lbenaducci;


public final class Book extends PhysicalProduct {
    private String author;

    public Book(String name, double price, Dimensions dimensions, double weight, String author) {
        super(name, price, dimensions, weight);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Author: " + author);
    }
}
