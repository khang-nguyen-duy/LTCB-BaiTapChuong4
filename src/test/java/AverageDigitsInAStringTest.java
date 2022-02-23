import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AverageDigitsInAStringTest {

    @Test
    void average() {
        String string = "Hello123";
        double expected = 2.0;
        Assertions.assertEquals(expected, AverageDigitsInAString.average(string));
    }
}