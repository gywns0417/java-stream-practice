package problem.hard;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;
import problem.hard.resources.Customer;
import problem.hard.resources.Order;
import problem.hard.resources.Product;

public class Problem85Test {

    @Test
    public void testCalculateTotalOrderAmountByCustomer() {
        Product p1 = new Product("Product1", 100.0);
        Product p2 = new Product("Product2", 200.0);
        List<Customer> customers = Arrays.asList(
                new Customer("Alice", Arrays.asList(new Order(p1, 2), new Order(p2, 1))),
                new Customer("Bob", Arrays.asList(new Order(p2, 2)))
        );

        Map<String, Double> totalAmounts = Problem85.calculateTotalOrderAmountByCustomer(customers);
        assertEquals(400.0, totalAmounts.get("Alice"));
        assertEquals(400.0, totalAmounts.get("Bob"));
    }
}
