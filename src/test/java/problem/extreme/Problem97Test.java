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

public class Problem97Test {

    @Test
    public void testCalculateTotalProjectDurationByDepartment() {
        Project project1 = new Project("Project A", LocalDate.of(2020, 1, 1), LocalDate.of(2020, 6, 30));
        Project project2 = new Project("Project B", LocalDate.of(2020, 7, 1), LocalDate.of(2020, 12, 31));

        Department department1 = new Department("Development", Arrays.asList());
        Department department2 = new Department("Marketing", Arrays.asList());

        Employee emp1 = new Employee("Alice", department1, LocalDate.of(2010, 1, 1), Arrays.asList(project1));
        Employee emp2 = new Employee("Bob", department1, LocalDate.of(2012, 1, 1), Arrays.asList(project1, project2));
        Employee emp3 = new Employee("Charlie", department2, LocalDate.of(2018, 1, 1), Arrays.asList(project2));
        department1.addEmployee(emp1);
        department1.addEmployee(emp2);
        department2.addEmployee(emp3);

        List<Department> departments = Arrays.asList(department1, department2);

        Map<String, Long> totalDurations = Problem97.calculateTotalProjectDurationByDepartment(departments);

        // Assuming that project durations are calculated in days
        assertEquals(362, totalDurations.get("Development")); // Project A: 181 days, Project B: 181 days
        assertEquals(181, totalDurations.get("Marketing")); // Project B: 181 days
    }
}
