package CollectionsExercises;

import java.util.ArrayList;
public class ArrayList1 {
    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(8);
        numbers.add(10);
        numbers.add(15);

        // Calculate and print the sum of even numbers
        int evenSum = sumEven(numbers);
        System.out.println("Sum of even numbers: " + evenSum);
    }
}