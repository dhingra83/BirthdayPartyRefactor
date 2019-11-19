package model;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class OrderItem {
    private int quantity = 1;
    private Product product;

    public OrderItem(Product product) {
        this.product = product;
    }

    public OrderItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public void listDetails() {
        System.out.println(product.details() + " Quantity: " + quantity);
    }
}
