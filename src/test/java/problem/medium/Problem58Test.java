package problem.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import problem.medium.resources.Employee;

public class Problem58Test {

    @Test
    public void testGetOldestEmployeeName() {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 60, "HR"),
                new Employee("Bob", 58, "IT"),
                new Employee("Charlie", 60, "Sales")
        );
        assertEquals("Alice", Problem58.getOldestEmployeeName(employees)); // 예시 결과, 실제로는 Alice 또는 Charlie가 될 수 있음
    }
}
