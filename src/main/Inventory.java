package main;

import java.util.List;
import java.util.ArrayList;
import java.util.Collectors;

public class Inventory {
  private List<Product> products;

  public Inventory() {
    this.products = new ArrayList<>();
  }
  public void addProduct(Product product) {
    products.add(product);
  }

  public double calculateTotalInventoryValue() {
    return products.stream().mapToDouble(Product::calculateTotalValue).sum();
  }
  public List<Product> getProductsBelowThreshold(int threshold) {
    return products.stream().filter(product -> product.getQuantity() < threshold).collect(Collectors.toList());
  }

}
  
