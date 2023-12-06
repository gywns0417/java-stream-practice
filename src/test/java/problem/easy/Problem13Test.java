package problem.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.LinkedList;
import java.util.Queue;
import org.junit.jupiter.api.Test;

public class Problem13Test {

    @Test
    public void testDoubleEach() {
        Queue<Integer> input = new LinkedList<>();
        input.add(1);
        input.add(2);
        input.add(3);

        Queue<Integer> expected = new LinkedList<>();
        expected.add(2);
        expected.add(4);
        expected.add(6);

        assertEquals(expected, Problem13.doubleEach(input));
    }
}
