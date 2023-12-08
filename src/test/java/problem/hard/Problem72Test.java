package problem.hard;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.Test;

public class Problem72Test {

    @Test
    public void testFindSubListsMeetingCriteria() {
        Set<List<Integer>> subLists = Problem72.findSublistsMeetingCriteria(Arrays.asList(1, 2, 3, 4));
        assert subLists != null;
        assertTrue(subLists.contains(Arrays.asList(1, 3, 4)));
    }
}
