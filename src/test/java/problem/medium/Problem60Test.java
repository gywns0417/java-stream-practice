package problem.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import problem.medium.resources.Customer2;
import problem.medium.resources.Employee;
import problem.medium.resources.Order;
import problem.medium.resources.Product;

public class Problem60Test {

    @Test
    public void testCalculateTotalPriceOfElectronicsOrderedByITEmployees() {
        List<Customer2> customers = Arrays.asList(
                new Customer2("Alice", Arrays.asList(new Order("Laptop", 1), new Order("Bread", 2))),
                new Customer2("Bob", Arrays.asList(new Order("Smartphone", 1))),
                new Customer2("Charlie", Arrays.asList(new Order("Laptop", 1)))
        );

        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 30, "IT"),
                new Employee("Bob", 28, "IT"),
                new Employee("David", 32, "Sales")
        );

        List<Product> products = Arrays.asList(
                new Product("Laptop", 1000.00),
                new Product("Smartphone", 800.00),
                new Product("Bread", 3.00)
        );

        double expected = 1800.00; // Alice의 노트북과 Bob의 스마트폰 가격 합계
        assertEquals(expected, Problem60.calculateTotalPriceOfElectronicsOrderedByITEmployees(customers, employees, products));
    }
}
