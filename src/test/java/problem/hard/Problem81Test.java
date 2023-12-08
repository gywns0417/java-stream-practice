package problem.hard;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;
import problem.hard.resources.Author;
import problem.hard.resources.Book;
import problem.hard.resources.Publisher;

public class Problem81Test {

    @Test
    public void testCalculateAverageBookPriceByPublisher() {
        Publisher p1 = new Publisher("Publisher1", "Address1");
        Publisher p2 = new Publisher("Publisher2", "Address2");
        List<Book> books = Arrays.asList(
            new Book("Book1", new Author("Author1", 40, "Genre1"), 100.0, p1),
            new Book("Book2", new Author("Author2", 50, "Genre2"), 150.0, p1),
            new Book("Book3", new Author("Author1", 40, "Genre1"), 200.0, p2)
        );
        
        Map<String, Double> averagePrices = Problem81.calculateAverageBookPriceByPublisher(books);
        assertEquals(125.0, averagePrices.get("Publisher1"));
        assertEquals(200.0, averagePrices.get("Publisher2"));
    }
}
