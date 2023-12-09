package problem.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import problem.medium.resources.Employee;

public class Problem51Test {

    @Test
    public void testGetNamesOfITDepartmentEmployeesOver30() {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 35, "IT"),
                new Employee("Bob", 25, "IT"),
                new Employee("Charlie", 32, "HR"),
                new Employee("David", 40, "IT")
        );

        List<String> expected = Arrays.asList("Alice", "David");
        assertEquals(expected, Problem51.getNamesOfITDepartmentEmployeesOver30(employees));
    }
}
