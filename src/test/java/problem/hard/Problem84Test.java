package problem.hard;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;
import problem.hard.resources.Publisher;

public class Problem84Test {

    @Test
    public void testFindPublishersByAddress() {
        List<Publisher> publishers = Arrays.asList(
            new Publisher("Publisher1", "Address1"),
            new Publisher("Publisher2", "Address2"),
            new Publisher("Publisher3", "Address1")
        );
        
        Map<String, List<Publisher>> publishersByAddress = Problem84.findPublishersByAddress(publishers);
        assertEquals(2, publishersByAddress.get("Address1").size());
        assertEquals(1, publishersByAddress.get("Address2").size());
    }
}
