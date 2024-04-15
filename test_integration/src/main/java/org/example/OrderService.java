package org.example;

public class OrderService {
    private OrderDao orderDao;

    // Constructeur
    public OrderService(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    // Méthode pour créer une commande
    public void createOrder(Order order) {

        // Enregistrer la commande en utilisant OrderDao
        orderDao.saveOrder(order);
    }
}
