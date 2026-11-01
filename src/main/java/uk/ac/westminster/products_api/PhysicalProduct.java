package uk.ac.westminster.products_api;

public class PhysicalProduct extends Product implements Discountable{
    private double weightKg;
    private String dimensions;

    public PhysicalProduct(Long id, String name, double price, double weightKg, String dimensions) {
        super(id, name, price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }

    public PhysicalProduct(double weightKg, String dimensions) {
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    // check about supper thing
    @Override
    public String getSummary(){
        return "Physical:" + getName()+" | Dimensions: "+ getDimensions();
    }

    // Add this field at the top
    private double discountedPrice;

    // Add these overrides at the bottom
    @Override
    public void applyDiscount(double rate) {
        double capped = Math.min(rate, 0.20);
        this.discountedPrice = getPrice() * (1 - capped);
    }

    @Override
    public double getDiscountedPrice() {
        return discountedPrice;
    }
}