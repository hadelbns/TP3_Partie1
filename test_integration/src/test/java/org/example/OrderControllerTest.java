package org.example;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


public class OrderControllerTest {
    private OrderController orderController;
    @Mock
    private OrderService mockOrderService;
    @Mock
    private OrderDao mockOrderDao;
    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        //comment faire l'injection a retenir
        orderController = new OrderController(mockOrderService);
    }

    @Test
    public void testCreateOrder() {
        // Créer un objet Order fictif pour le test
        Order order = new Order(1,"hadoula",4);


        // Appeler la méthode à tester
        orderController.createOrder(order);
        // Vérifier que OrderService.createOrder a été appelé avec le bon argument (order)
        verify(mockOrderService).createOrder(order);


        doNothing().when(mockOrderDao).saveOrder(order);

        // Vérifier que OrderDao.saveOrder a été appelé avec l'objet de commande créé
        verify(mockOrderDao).saveOrder(order);
    }
}
