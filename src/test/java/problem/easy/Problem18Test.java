package problem.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.PriorityQueue;
import java.util.Queue;
import org.junit.jupiter.api.Test;

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
