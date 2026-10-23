package uk.ac.westminster.products_api;

import java.security.PrivateKey;

public class DigitalProduct extends Product {
    private String DownloadUrl;
    private double fileSizeMB;

    public DigitalProduct(Long id, String name, double price,
                           String downloadUrl, double fileSizeMB){
        super(id, name, price);
        this.DownloadUrl = downloadUrl;
        this.fileSizeMB = fileSizeMB;
    }
    public String getDownloadUrl() {
        return DownloadUrl;
    }
    public double getFileSizeMB() {
        return fileSizeMB;
    }

    }
