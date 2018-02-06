import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearch {

    public boolean contains(List<Integer> numbers, Integer value) {

        Collections.sort(numbers);
        int lowerBound = 0;
        int upperBound = numbers.size() - 1;
        boolean isFound = false;

        if (value < numbers.get(lowerBound) || value > numbers.get(upperBound)) {
            return false;
        }

        while (!isFound && lowerBound < upperBound) {

            int midPoint = (upperBound + lowerBound) / 2;

            if (numbers.get(midPoint) < value) {
                lowerBound = midPoint + 1;
            } else if (numbers.get(midPoint) > value) {
                upperBound = midPoint - 1;
            } else {
                isFound = true;
            }
        }

        return isFound;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(80,1,2,3,4,5,6,7,8,9,45,87,245,100);
        int value = 100;
        System.out.println(numbers);
        System.out.println("searched value is " + value);

        System.out.println(new BinarySearch().contains(numbers, value));
    }
}
