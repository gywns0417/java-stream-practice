package problem.easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.PriorityQueue;
import java.util.Queue;

public class Problem18Test {

    @Test
    public void testCreatePriorityQueueFromStream() {
        int[] input = {4, 1, 3, 2, 5};
        Queue<Integer> expected = new PriorityQueue<>();
        for (int n : new int[]{1, 2, 3, 4, 5}) {
            expected.add(n);
        }
        assertEquals(expected, Problem18.createPriorityQueueFromStream(input));
    }
}
