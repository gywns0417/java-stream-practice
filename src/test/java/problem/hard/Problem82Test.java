package problem.hard;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;
import problem.hard.resources.Author;
import problem.hard.resources.Book;
import problem.hard.resources.Publisher;

public class Problem82Test {

    @Test
    public void testCountBooksByAuthor() {
        Author a1 = new Author("Author1", 40, "Genre1");
        Author a2 = new Author("Author2", 50, "Genre2");
        List<Book> books = Arrays.asList(
            new Book("Book1", a1, 100.0, new Publisher("Publisher1", "Address1")),
            new Book("Book2", a2, 150.0, new Publisher("Publisher1", "Address1")),
            new Book("Book3", a1, 200.0, new Publisher("Publisher2", "Address2"))
        );
        
        Map<String, Long> bookCounts = Problem82.countBooksByAuthor(books);
        assertEquals(2, bookCounts.get("Author1"));
        assertEquals(1, bookCounts.get("Author2"));
    }
}
