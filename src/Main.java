import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        ArrayList<Integer> positiveNumbers = new ArrayList<>();
        for (Integer number : intList) {
            if (number > 0) {
                positiveNumbers.add(number);
            }
        }

        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (Integer number : positiveNumbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }

        evenNumbers.sort(Comparator.naturalOrder());

        for (Integer number : evenNumbers) {
            System.out.print(number + " ");
        }
    }
}