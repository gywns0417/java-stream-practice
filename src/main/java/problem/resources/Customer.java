package problem.resources;

public class Customer {
    private final int id;
    private final String name;
    private final int age;

    public Customer(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // 필요에 따라 toString(), equals(), hashCode() 메서드를 오버라이드할 수 있습니다.
}