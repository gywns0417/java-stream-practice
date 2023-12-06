package problem.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class Problem49Test {

    @Test
    public void testCapitalizeFirstLetter() {
        assertEquals(Arrays.asList("Apple", "Banana", "Cherry"), Problem49.capitalizeFirstLetter(Arrays.asList("apple", "banana", "cherry")));
    }
}
