package model;

import org.junit.Test;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

public class OrderTest {
    @Test
    public void testOrderWithCakeAndBalloons() {
        Balloon balloon = Balloon.builder()
                .color("red")
                .material("mylar")
                .build();
        Cake cake = Cake.builder()
                .flavor("chocolate")
                .frostingFlavor("chocolate")
                .shape("circle")
                .size("large")
                .color("brown")
                .build();
        Order order = new Order();
        order.addOrderItem(new OrderItem(balloon, 4));
        order.addOrderItem(new OrderItem(cake));

        assertThat(order.getOrderItems(), hasSize(2));
        Map<Product, Integer> productToQuantityMap = order.getOrderItems().stream().collect(Collectors.toMap(OrderItem::getProduct,
                OrderItem::getQuantity));
        Set<Product> products = productToQuantityMap.keySet();
        assertThat(products, hasSize(2));
        assertThat(products, hasItem(balloon));
        assertThat(productToQuantityMap.get(balloon), equalTo(4));
        assertThat(products, hasItem(cake));
        assertThat(productToQuantityMap.get(cake), equalTo(1));
    }

    @Test
    public void testOrderWithOnlyCake() {
        Cake cake = Cake.builder()
                .flavor("chocolate")
                .frostingFlavor("chocolate")
                .shape("circle")
                .size("large")
                .color("brown")
                .build();
        Order order = new Order();
        order.addOrderItem(new OrderItem(cake));

        assertThat(order.getOrderItems(), hasSize(1));
        Map<Product, Integer> productToQuantityMap = order.getOrderItems().stream().collect(Collectors.toMap(OrderItem::getProduct,
                OrderItem::getQuantity));
        Set<Product> products = productToQuantityMap.keySet();
        assertThat(products, hasSize(1));
        assertThat(products, hasItem(cake));
        assertThat(productToQuantityMap.get(cake), equalTo(1));
    }

    @Test
    public void testOrderWithOnlyBalloons() {
        Balloon balloon = Balloon.builder()
                .color("red")
                .material("mylar")
                .build();
        Order order = new Order();
        order.addOrderItem(new OrderItem(balloon, 4));

        assertThat(order.getOrderItems(), hasSize(1));
        Map<Product, Integer> productToQuantityMap = order.getOrderItems().stream().collect(Collectors.toMap(OrderItem::getProduct,
                OrderItem::getQuantity));
        Set<Product> products = productToQuantityMap.keySet();
        assertThat(products, hasSize(1));
        assertThat(products, hasItem(balloon));
        assertThat(productToQuantityMap.get(balloon), equalTo(4));
    }
}
