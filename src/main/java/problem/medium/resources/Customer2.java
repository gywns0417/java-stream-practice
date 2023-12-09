package problem.medium.resources;

import java.util.List;

public class Customer2 {
    private String name;
    private List<Order> orders;

    public Customer2(String name, List<Order> orders) {
        this.name = name;
        this.orders = orders;
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}