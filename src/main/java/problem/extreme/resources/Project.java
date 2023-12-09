package problem.extreme.resources;

import java.time.LocalDate;

public class Project {
    private String title;
    private LocalDate startDate;
    private LocalDate endDate;

    public Project(String title, LocalDate startDate, LocalDate endDate) {
        this.title = title;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public long getProjectDuration() {
        return endDate.toEpochDay() - startDate.toEpochDay();
    }
}