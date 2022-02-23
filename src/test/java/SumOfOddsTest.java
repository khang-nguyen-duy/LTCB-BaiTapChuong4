import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfOddsTest {

    @Test
    void sumOfOdds() {
        int n = 100;
        int sum = SumOfOdds.sumOfOdds(n);
        Assertions.assertEquals(2500, sum);
    }
}