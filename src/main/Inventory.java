package main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import entity.Clothing;
import entity.Electronics;
import interfaces.Product;

public class Inventory {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();

        productList.add(new Electronics("101", "Refrigerator", 380.75, 12));

        productList.add(new Electronics("102", "Washing Machine", 18000.00, 4));

        productList.add(new Clothing("141", "Denim Jeans", 2500.75, 30));

        productList.forEach(product -> {
            double TotalValue = product.TotalValue();

            System.out.println("Product Type: " + product.getClass().getSimpleName() + ", Product Name: "
                    + product.getName() + ", Total Value of the product in the list: Rs. " + TotalValue);
        });

        // used method reference
        double totalInventoryValue = productList.stream().mapToDouble(Product::TotalValue).sum();

        System.out.println("Total Inventory Value: " + totalInventoryValue);

        // using filter method to get the products with higher quantity (i.e. greater
        // than 5)

        List<Product> highQuantityProducts = productList.stream().filter(Product -> Product.getQuantity() > 5)
                .collect(Collectors.toList());

        System.out.println("Products with quantity greater than 5: ");
        highQuantityProducts
                .forEach(Product -> System.out.println(Product.getName() + " : " + Product.getClass().getSimpleName()));
    }
}
