package br.com.lbenaducci;

public class DigitalProduct extends Product implements Downloadable {
    private String fileSize;

    public DigitalProduct(String name, double price, String fileSize) {
        super(name, price);
        this.fileSize = fileSize;
    }

    public String getFileSize() {
        return fileSize;
    }

    @Override
    public void displayDetails() {
        System.out.println("Digital Product: " + getName() + " - Price: $" + getPrice());
        System.out.println("File Size: " + fileSize);
    }

    @Override
    public void download() {
        System.out.println("Downloading " + getName() + " (" + fileSize + ")");
    }
}
