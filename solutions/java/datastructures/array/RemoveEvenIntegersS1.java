import java.util.ArrayList;
import java.util.List;

public class RemoveEvenIntegersS1 {
    public static void main(String[] args) {
        int[] input1 = {1, 2, 4, 5, 10, 6, 3};

        System.out.println(removeEven(input1));
    }

    private static List<Integer> removeEven(int[] input) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int number: input) {
            if (number % 2 != 0) {
                result.add(number);
            }
        }

        return result;
    }
}
