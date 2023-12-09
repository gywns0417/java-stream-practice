package problem.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import problem.medium.resources.Product;

public class Problem54Test {

    @Test
    public void testGetMostExpensiveProductName() {
        List<Product> products = Arrays.asList(
                new Product("Laptop", 1200.00),
                new Product("Smartphone", 800.00)
        );
        assertEquals("Laptop", Problem54.getMostExpensiveProductName(products));
        assertEquals("", Problem54.getMostExpensiveProductName(Collections.emptyList()));
    }
}
