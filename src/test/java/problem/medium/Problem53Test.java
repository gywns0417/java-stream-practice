package problem.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import problem.resources.Customer2;
import problem.resources.Order;

public class Problem53Test {

    @Test
    public void testGetTotalMilkOrdersForEachCustomer() {
        List<Customer2> customers = Arrays.asList(
                new Customer2("Alice", Arrays.asList(new Order("Milk", 2), new Order("Bread", 1))),
                new Customer2("Bob", Arrays.asList(new Order("Milk", 3)))
        );

        List<String> expected = Arrays.asList("Alice: 2", "Bob: 3");
        assertEquals(expected, Problem53.getTotalMilkOrdersForEachCustomer(customers));
    }
}
