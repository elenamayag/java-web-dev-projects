package CollectionsExercises;

public class Array {public static void main(String[] args) {
    int[] integerArray = {1, 1, 2, 3, 5, 8};

    // Print all values in the array
    System.out.println("All values in the array:");
    for (int value : integerArray) {
        System.out.println(value);
    }

    // Print only odd numbers in the array
    System.out.println("\nOdd numbers in the array:");
    for (int value : integerArray) {
        if (value % 2 != 0) {
            System.out.println(value);
        }
    }
}
}
