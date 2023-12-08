package problem.hard;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.Set;
import org.junit.jupiter.api.Test;

public class Problem79Test {

    @Test
    public void testFindPalindromicCombinations() {
        Set<String> palindromes = Problem79.findPalindromicCombinations(Arrays.asList("a", "b", "aa", "aba"));
        assertTrue(palindromes.containsAll(Arrays.asList("a", "aa", "aba", "baab", "abaa")));
    }
}
