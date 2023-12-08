package problem.hard.resources;

public class Author {
    private String name;
    private int age;
    private String genre;

    public Author(String name, int age, String genre) {
        this.name = name;
        this.age = age;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGenre() {
        return genre;
    }
}