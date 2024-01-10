package CollectionsExercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList3 {
    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }

    public static void printWordsWithLength(ArrayList<String> words, int length) {
        for (String word : words) {
            if (word.length() == length) {
                System.out.println(word);
            }
        }
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

        // Create an ArrayList of words
        ArrayList<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("grape");
        words.add("pear");
        words.add("kiwi");
        words.add("peach");

        // Get user input for word length
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the word length to search for: ");
        int searchLength = scanner.nextInt();

        // Print words with the specified length
        System.out.println("Words with " + searchLength + " letters:");
        printWordsWithLength(words, searchLength);

        // Close the scanner
        scanner.close();
    }
}