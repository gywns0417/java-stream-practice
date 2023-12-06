package problem.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import problem.resources.Product;

public class Problem52Test {

    @Test
    public void testGetProductNamesUnder20Dollars() {
        List<Product> products = Arrays.asList(
                new Product("Milk", 3.50),
                new Product("Bread", 2.50),
                new Product("Laptop", 500.00)
        );

        List<String> expected = Arrays.asList("Milk", "Bread");
        assertEquals(expected, Problem52.getProductNamesUnder20Dollars(products));
    }
}
