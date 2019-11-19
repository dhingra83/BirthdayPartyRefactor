package scrap.heap.refactor;

import model.*;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        //Order 1
        Balloon balloon1 = Balloon.builder()
                .color("red")
                .material("mylar")
                .build();
        Cake cake1 = Cake.builder()
                .flavor("chocolate")
                .frostingFlavor("chocolate")
                .shape("circle")
                .size("large")
                .color("brown")
                .build();
        Order order1 = new Order();
        order1.addOrderItem(new OrderItem(balloon1, 4));
        order1.addOrderItem(new OrderItem(cake1));
        order1.listOrderDetails();

        //Order 2
        Balloon balloon2 = Balloon.builder()
                .color("blue")
                .material("latex")
                .build();
        Cake cake2 = Cake.builder()
                .flavor("Vanilla")
                .frostingFlavor("chocolate")
                .shape("square")
                .size("med")
                .color("brown")
                .build();
        Order order2 = new Order();
        order2.addOrderItem(new OrderItem(balloon2, 7));
        order2.addOrderItem(new OrderItem(cake2));
        order2.listOrderDetails();

        //Order 3
        Balloon balloon3 = Balloon.builder()
                .color("yellow")
                .material("mylar")
                .build();
        Cake cake3 = Cake.builder()
                .flavor("Vanilla")
                .frostingFlavor("vanilla")
                .shape("square")
                .size("small")
                .color("yellow")
                .build();
        Order order3 = new Order();
        order3.addOrderItem(new OrderItem(balloon3, 4));
        order3.addOrderItem(new OrderItem(cake3));
        order3.listOrderDetails();
    }
}
