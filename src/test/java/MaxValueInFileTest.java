import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class MaxValueInFileTest {

    @Test
    void maxValueInFile() throws FileNotFoundException {
        String fileName = "data/input.txt";
        double expected = 40.0;
        Assertions.assertEquals(expected, MaxValueInFile.maxValueInFile(fileName));
    }
}