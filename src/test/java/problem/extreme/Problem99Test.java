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

public class Problem99Test {

    @Test
    public void testCalculateAverageProjectDurationByDepartment() {
        Department development = new Department("Development", Arrays.asList());
        Department marketing = new Department("Marketing", Arrays.asList());

        Project project1 = new Project("Project A", LocalDate.of(2020, 1, 1), LocalDate.of(2020, 3, 31)); // 90 days
        Project project2 = new Project("Project B", LocalDate.of(2020, 4, 1), LocalDate.of(2020, 6, 30)); // 90 days

        Employee emp1 = new Employee("Alice", development, LocalDate.of(2010, 1, 1), Arrays.asList(project1));
        Employee emp2 = new Employee("Bob", development, LocalDate.of(2012, 1, 1), Arrays.asList(project1, project2));
        Employee emp3 = new Employee("Charlie", marketing, LocalDate.of(2018, 1, 1), Arrays.asList(project2));

        development.addEmployee(emp1);
        development.addEmployee(emp2);
        marketing.addEmployee(emp3);

        List<Department> departments = Arrays.asList(development, marketing);

        Map<String, Double> averageDurations = Problem99.calculateAverageProjectDurationByDepartment(departments);

        assertEquals(90.0, averageDurations.get("Development"), 0.1);
        assertEquals(90.0, averageDurations.get("Marketing"), 0.1);
    }
}
