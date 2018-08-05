/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tom
 */
public class Product {
    
    private String name;
    private double price;
    private int quantity;
    
    public Product(String nameAtStart, double priceAtStart, int amountAtStart) {
        this.name = nameAtStart;
        this.price = priceAtStart;
        this.quantity = amountAtStart;
        
    }
    
    public void printProduct() {
        System.out.println(name + ", price " + price + ", amount " + quantity);
    }
}
