import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AverageValue {
    public static double averageCal(String fileName) throws FileNotFoundException {
        int sum=0;
        File input = new File("data/input.txt");
        Scanner scanner = new Scanner(input);
        while (scanner.hasNext())
        {
            double temp = scanner.nextDouble();
            sum += temp;

        }

        double result = sum/4;
        return result;
    }
}
