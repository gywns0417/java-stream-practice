package problem.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;
import problem.medium.resources.Product;

public class Problem59Test {

    @Test
    public void testGetTotalPriceByCategory() {
        List<Product> products = Arrays.asList(
                new Product("Milk", 3.50),
                new Product("Bread", 2.50),
                new Product("Apple", 1.50)
        );

        Map<Character, Double> expected = Map.of('M', 3.50, 'B', 2.50, 'A', 1.50);
        assertEquals(expected, Problem59.getTotalPriceByCategory(products));
    }
}
