package entity;

import interfaces.Product;

public class Clothing implements Product {
    private String productId;
    private String name;
    private double price;
    private int quantity;

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
