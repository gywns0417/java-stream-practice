package problem.hard;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;
import problem.hard.resources.Order;
import problem.hard.resources.Product;

public class Problem86Test {

    @Test
    public void testCalculateTotalQuantitySoldByProduct() {
        Product p1 = new Product("Product1", 100.0);
        Product p2 = new Product("Product2", 200.0);
        List<Order> orders = Arrays.asList(
                new Order(p1, 2),
                new Order(p1, 3),
                new Order(p2, 1)
        );

        Map<String, Integer> totalQuantities = Problem86.calculateTotalQuantitySoldByProduct(orders);
        assertEquals(5, totalQuantities.get("Product1"));
        assertEquals(1, totalQuantities.get("Product2"));
    }
}
