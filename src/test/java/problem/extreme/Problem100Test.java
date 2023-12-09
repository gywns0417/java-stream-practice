package problem.extreme;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;
import problem.extreme.resources.Department;
import problem.extreme.resources.Employee;
import problem.extreme.resources.Project;

public class Problem100Test {

    @Test
    public void testAnalyzeEmployeePerformanceByProject() {
        Department development = new Department("Development", Arrays.asList());
        Department marketing = new Department("Marketing", Arrays.asList());

        Project project1 = new Project("Project A", LocalDate.of(2020, 1, 1), LocalDate.of(2020, 12, 31));
        Project project2 = new Project("Project B", LocalDate.of(2021, 1, 1), LocalDate.of(2021, 12, 31));

        Employee emp1 = new Employee("Alice", development, LocalDate.of(2015, 1, 1), Arrays.asList(project1));
        Employee emp2 = new Employee("Bob", marketing, LocalDate.of(2016, 1, 1), Arrays.asList(project1, project2));
        Employee emp3 = new Employee("Charlie", development, LocalDate.of(2017, 1, 1), Arrays.asList(project2));

        List<Employee> employees = Arrays.asList(emp1, emp2, emp3);

        Map<Project, Map<Employee, Map<String, Object>>> performanceData = Problem100.analyzeEmployeePerformanceByProject(employees);

        // Verifying the structure and content of the performance data
        assertNotNull(performanceData);
        assertTrue(performanceData.containsKey(project1));
        assertTrue(performanceData.containsKey(project2));
        assertTrue(performanceData.get(project1).containsKey(emp1));
        assertTrue(performanceData.get(project1).containsKey(emp2));
        // Further assertions based on the expected analysis results
    }
}
