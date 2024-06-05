import java.util.Arrays;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        int[] arr = random.ints(5, 0, 100).toArray(); // Generates 5 random integers between 0 (inclusive) and 100 (exclusive)
        
    }
}
