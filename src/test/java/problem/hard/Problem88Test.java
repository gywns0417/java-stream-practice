package problem.hard;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;
import problem.hard.resources.Customer;
import problem.hard.resources.Order;
import problem.hard.resources.Product;

public class Problem88Test {

    @Test
    public void testFindHighestPricedOrderPerCustomer() {
        Product p1 = new Product("Product1", 100.0);
        Product p2 = new Product("Product2", 200.0);
        List<Customer> customers = Arrays.asList(
                new Customer("Alice", Arrays.asList(new Order(p1, 1), new Order(p2, 2))),
                new Customer("Bob", Arrays.asList(new Order(p2, 1)))
        );

        Map<String, Order> highestOrders = Problem88.findHighestPricedOrderPerCustomer(customers);
        assertEquals(p2, highestOrders.get("Alice").getProduct());
        assertEquals(p2, highestOrders.get("Bob").getProduct());
    }
}
