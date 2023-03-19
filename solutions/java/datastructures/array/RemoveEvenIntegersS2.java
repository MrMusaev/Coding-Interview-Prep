import java.util.Arrays;
import java.util.List;

public class RemoveEvenIntegersS2 {
    public static void main(String[] args) {
        int[] input1 = {1, 2, 4, 5, 10, 6, 3};

        System.out.println(removeEven(input1));
    }

    private static List<Integer> removeEven(int[] input) {
        // Java 16 or higher versions
        return Arrays.stream(input)
                .boxed()
                .filter(num -> num % 2 != 0)
                .toList();
    }
}
