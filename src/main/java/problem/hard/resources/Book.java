package problem.hard.resources;

public class Book {
    private String title;
    private Author author;
    private double price;
    private Publisher publisher;

    public Book(String title, Author author, double price, Publisher publisher) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public Publisher getPublisher() {
        return publisher;
    }
}
