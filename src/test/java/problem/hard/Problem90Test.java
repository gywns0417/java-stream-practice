package problem.hard;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;
import problem.hard.resources.Customer;
import problem.hard.resources.Order;
import problem.hard.resources.Product;

public class Problem90Test {

    @Test
    public void testCalculateTotalOrderAmountByCustomer() {
        Product p1 = new Product("Product1", 10.0);
        Product p2 = new Product("Product2", 20.0);
        Customer c1 = new Customer("Alice", Arrays.asList(new Order(p1, 1), new Order(p2, 2)));
        Customer c2 = new Customer("Bob", Arrays.asList(new Order(p1, 3)));
        List<Customer> customers = Arrays.asList(c1, c2);

        Map<String, Double> totalAmounts = Problem90.calculateTotalOrderAmountByCustomer(customers);
        assertEquals(50.0, totalAmounts.get("Alice")); // 10 * 1 + 20 * 2
        assertEquals(30.0, totalAmounts.get("Bob"));   // 10 * 3
    }
}
