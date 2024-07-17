package entity;

import interfaces.Product;

public class Clothing implements Product {
    private String productId;
    private String name;
    private double price;
    private int quantity;

    public Clothing(String productId, String name, double price, int quantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String getProductId() {
        return productId;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public double TotalValue() {
        double result = price * quantity;
        return result;
    }

}
