package problem.extreme.resources;

import java.util.List;

public class Department {
    private String name;
    private List<Employee> employees;

    public Department(String name, List<Employee> employees) {
        this.name = name;
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

}