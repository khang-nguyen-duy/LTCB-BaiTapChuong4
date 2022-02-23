import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class AverageValueTest {

    @Test
    void averageCal() throws FileNotFoundException {
        String fileName = "data/input.txt";
        double result = 25.0;
        Assertions.assertEquals(result, AverageValue.averageCal(fileName));
    }
}