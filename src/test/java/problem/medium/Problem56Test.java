package problem.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import problem.resources.Employee;

public class Problem56Test {

    @Test
    public void testGetNamesOfSalesDepartmentEmployees() {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 30, "Sales"),
                new Employee("Bob", 28, "IT"),
                new Employee("Charlie", 35, "Sales")
        );
        assertEquals(Arrays.asList("Alice", "Charlie"), Problem56.getNamesOfSalesDepartmentEmployees(employees));
    }
}
