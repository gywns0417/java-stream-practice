package problem.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import problem.medium.resources.Order;

public class Problem57Test {

    @Test
    public void testFindOrdersWithCoffee() {
        List<Order> orders = Arrays.asList(
                new Order("Coffee", 2),
                new Order("Tea", 1),
                new Order("Coffee", 3)
        );
        assertEquals(2, Problem57.findOrdersWithCoffee(orders).size());
    }
}
