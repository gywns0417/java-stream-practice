package problem.extreme.resources;

import java.time.LocalDate;
import java.util.List;

public class Employee {
    private String name;
    private Department department;
    private LocalDate joiningDate;
    private List<Project> projects;

    public Employee(String name, Department department, LocalDate joiningDate, List<Project> projects) {
        this.name = name;
        this.department = department;
        this.joiningDate = joiningDate;
        this.projects = projects;
    }

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }

    public LocalDate getJoiningDate() {
        return joiningDate;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public long getYearsOfExperience() {
        return LocalDate.now().getYear() - joiningDate.getYear();
    }

    public int getNumberOfProjects() {
        return projects.size();
    }
}