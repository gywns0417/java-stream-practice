package problem.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;
import problem.easy.resources.Customer;

public class Problem10Test {

    @Test
    public void testGroupCustomersByAge() {
        List<Customer> input = Arrays.asList(
                new Customer(1, "Alice", 30),
                new Customer(2, "Bob", 20),
                new Customer(3, "Charlie", 30)
        );
        Map<Integer, List<Customer>> result = Problem10.groupCustomersByAge(input);
        assertEquals(2, result.get(30).size());
        assertEquals(1, result.get(20).size());
    }
}