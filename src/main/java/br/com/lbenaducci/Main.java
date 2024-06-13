package br.com.lbenaducci;

public class Main {
	public static void main(String[] args) {
		Dimensions bookDimensions = new Dimensions(15.2, 22.9, 2.0);
		Book book = new Book("Effective Java", 45.99, bookDimensions, 0.5, "Joshua Bloch");

		Dimensions electronicsDimensions = new Dimensions(10.0, 20.0, 5.0);
		Electronics electronics = new Electronics("Smartphone", 699.99, electronicsDimensions, 0.4, "Samsung");

		DigitalProduct eBook = new DigitalProduct("Clean Code eBook", 19.99, "5MB");

		book.displayDetails();
		electronics.displayDetails();
		eBook.displayDetails();

		book.applyDiscount(10); // Aplica 10% de desconto ao livro
		electronics.applyDiscount(15); // Aplica 15% de desconto ao eletrônico

		eBook.download(); // Realiza o download do produto digital

		System.out.println("Author of Effective Java: " + book.getAuthor());
		System.out.println("Brand of Smartphone: " + electronics.getBrand());
		System.out.println("File Size of Clean Code eBook: " + eBook.getFileSize());
	}
}