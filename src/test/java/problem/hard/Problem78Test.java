package problem.hard;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.api.Test;

public class Problem78Test {

    @Test
    public void testFindMaxConsecutiveNumbersLength() {
        Stream<Integer> numbers = Stream.of(1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5);
        assertEquals(4, Problem78.findMaxConsecutiveNumbersLength(numbers));
    }
}
