package problem.extreme;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;
import problem.extreme.resources.Department;
import problem.extreme.resources.Employee;
import problem.extreme.resources.Project;

public class Problem98Test {

    @Test
    public void testEvaluateContributionByProject() {
        Project project1 = new Project("Project A", LocalDate.of(2020, 1, 1), LocalDate.of(2020, 6, 30));
        Project project2 = new Project("Project B", LocalDate.of(2020, 7, 1), LocalDate.of(2020, 12, 31));
        List<Project> projects = Arrays.asList(project1, project2);

        Employee emp1 = new Employee("Alice", new Department("Development", Arrays.asList()), LocalDate.of(2010, 1, 1), Arrays.asList(project1));
        Employee emp2 = new Employee("Bob", new Department("Development", Arrays.asList()), LocalDate.of(2012, 1, 1), Arrays.asList(project1, project2));

        List<Employee> employees = Arrays.asList(emp1, emp2);

        Map<String, Map<String, Double>> contributions = Problem98.evaluateContributionByProject(employees);

        // Assuming contributions are calculated based on some business logic
        assertEquals(1.0, contributions.get("Alice").get("Project A")); // Full contribution to Project A
        assertEquals(0.5, contributions.get("Bob").get("Project A")); // Half contribution to Project A
        assertEquals(0.5, contributions.get("Bob").get("Project B")); // Half contribution to Project B
    }
}
