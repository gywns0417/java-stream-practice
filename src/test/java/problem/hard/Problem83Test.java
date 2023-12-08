package problem.hard;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import problem.hard.resources.Author;
import problem.hard.resources.Book;
import problem.hard.resources.Publisher;

public class Problem83Test {

    @Test
    public void testFindBooksByGenre() {
        Author a1 = new Author("Author1", 40, "Genre1");
        Author a2 = new Author("Author2", 50, "Genre2");
        List<Book> books = Arrays.asList(
            new Book("Book1", a1, 100.0, new Publisher("Publisher1", "Address1")),
            new Book("Book2", a2, 150.0, new Publisher("Publisher1", "Address1")),
            new Book("Book3", a1, 200.0, new Publisher("Publisher2", "Address2"))
        );
        
        List<Book> genre1Books = Problem83.findBooksByGenre(books, "Genre1");
        assertEquals(2, genre1Books.size());
        assertEquals("Book1", genre1Books.get(0).getTitle());
        assertEquals("Book3", genre1Books.get(1).getTitle());
    }
}
