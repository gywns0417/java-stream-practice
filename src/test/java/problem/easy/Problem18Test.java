package problem.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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

        Queue<Integer> actual = Problem18.createPriorityQueueFromStream(input);
        assertTrue(actual instanceof PriorityQueue);
        assertEquals(expected.size(), actual.size());
        while (!expected.isEmpty())
            assertEquals(expected.poll(), actual.poll());
    }
}
