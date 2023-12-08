package problem.hard;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import problem.hard.resources.Customer;
import problem.hard.resources.Order;
import problem.hard.resources.Product;

public class Problem89Test {

    @Test
    public void testFindCustomersWhoOrderedProduct() {
        Product p1 = new Product("Product1", 100.0);
        Product p2 = new Product("Product2", 200.0);
        List<Customer> customers = Arrays.asList(
                new Customer("Alice", Arrays.asList(new Order(p1, 1), new Order(p2, 2))),
                new Customer("Bob", Arrays.asList(new Order(p2, 1)))
        );

        List<Customer> customersWhoOrderedP1 = Problem89.findCustomersWhoOrderedProduct(customers, "Product1");
        assertEquals(1, customersWhoOrderedP1.size());
        assertEquals("Alice", customersWhoOrderedP1.get(0).getName());
    }
}
