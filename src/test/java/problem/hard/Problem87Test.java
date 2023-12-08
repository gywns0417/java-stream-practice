package problem.hard;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import problem.hard.resources.Order;
import problem.hard.resources.Product;

public class Problem87Test {

    @Test
    public void testFindOrdersWithProductsPricedAbove() {
        Product p1 = new Product("Product1", 100.0);
        Product p2 = new Product("Product2", 200.0);
        List<Order> orders = Arrays.asList(
                new Order(p1, 1),
                new Order(p2, 2)
        );

        List<Order> filteredOrders = Problem87.findOrdersWithProductsPricedAbove(orders, 150.0);
        assertEquals(1, filteredOrders.size());
        assertEquals(p2, filteredOrders.get(0).getProduct());
    }
}
