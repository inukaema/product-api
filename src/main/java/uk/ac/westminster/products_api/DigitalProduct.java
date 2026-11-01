package uk.ac.westminster.products_api;

import java.security.PrivateKey;

public class DigitalProduct extends Product implements Discountable {
    private String downloadUrl;
    private double fileSizeMB;

    public DigitalProduct() {}
    public DigitalProduct(Long id, String name, double price,
                           String downloadUrl, double fileSizeMB){
        super(id, name, price);
        this.downloadUrl = downloadUrl;
        this.fileSizeMB = fileSizeMB;
    }
    public String getDownloadUrl() {
        return downloadUrl;
    }
    public double getFileSizeMB() {
        return fileSizeMB;
    }


    @Override
    public String getSummary(){
        return "Digital:" + getName()+" | Download: "+ getDownloadUrl();
    }

    // Add this field at the top with your others
    private double discountedPrice;

    // Add these overrides at the bottom
    @Override
    public void applyDiscount(double rate) {
        this.discountedPrice = getPrice() * (1 - rate);
    }

    @Override
    public double getDiscountedPrice() {
        return discountedPrice;
    }
    }
