package org.example;

public class OrderController {
    private OrderService orderService;
    // Constructeur
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    // Méthode pour créer une commande à partir du contrôleur
    public void createOrder(Order order) {
        orderService.createOrder(order);
    }
}
