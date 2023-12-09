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

public class Problem96Test {

    @Test
    public void testCalculateEmployeeExperienceStatsByProject() {
        Department department = new Department("Development", Arrays.asList());
        Project project1 = new Project("Project A", LocalDate.of(2020, 1, 1), LocalDate.of(2020, 12, 31));
        Project project2 = new Project("Project B", LocalDate.of(2021, 1, 1), LocalDate.of(2021, 12, 31));
        List<Project> projects = Arrays.asList(project1, project2);

        Employee emp1 = new Employee("Alice", department, LocalDate.of(2010, 1, 1), Arrays.asList(project1));
        Employee emp2 = new Employee("Bob", department, LocalDate.of(2012, 1, 1), Arrays.asList(project1, project2));
        Employee emp3 = new Employee("Charlie", department, LocalDate.of(2018, 1, 1), Arrays.asList(project2));
        List<Employee> employees = Arrays.asList(emp1, emp2, emp3);

        Map<String, Map<String, Double>> stats = Problem96.calculateEmployeeExperienceStatsByProject(projects, employees);

        // Assuming the current year is 2023 for test purposes
        Map<String, Double> projectAStats = stats.get("Project A");
        assertEquals(11.5, projectAStats.get("average"), 0.1);
        assertEquals(13, projectAStats.get("max"), 0.1);
        assertEquals(10, projectAStats.get("min"), 0.1);

        Map<String, Double> projectBStats = stats.get("Project B");
        assertEquals(8.0, projectBStats.get("average"), 0.1);
        assertEquals(11, projectBStats.get("max"), 0.1);
        assertEquals(5, projectBStats.get("min"), 0.1);
    }
}
