package problem.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import problem.medium.resources.Customer2;
import problem.medium.resources.Order;

public class Problem55Test {

    @Test
    public void testGetCustomerWhoOrderedMostBread() {
        List<Customer2> customers = Arrays.asList(
                new Customer2("Alice", Arrays.asList(new Order("Bread", 5), new Order("Milk", 2))),
                new Customer2("Bob", Arrays.asList(new Order("Bread", 7)))
        );
        assertEquals("Bob", Problem55.getCustomerWhoOrderedMostBread(customers));
    }
}
