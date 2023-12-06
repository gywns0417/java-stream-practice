package problem.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class Problem43Test {

    @Test
    public void testFilterStringsByLength() {
        assertEquals(Arrays.asList("cat", "dog"), Problem43.filterStringsByLength(Arrays.asList("cat", "sheep", "dog"), Arrays.asList(3, 3, 3)));
    }
}
