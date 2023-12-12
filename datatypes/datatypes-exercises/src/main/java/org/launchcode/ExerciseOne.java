package org.launchcode;
import java.util.Scanner;

// part B Numeric Types

public class ExerciseOne {
    public static void main(String[] args) {
        Scanner inputLength = new Scanner(System.in);
        System.out.println("What is the length of your rectangle.");

        String length = inputLength.nextLine();
        System.out.println("Your rectangles length is: " + length);

        Scanner inputWidth = new Scanner(System.in);
        System.out.println("What is the width of your rectangle.");

        String width = inputWidth.nextLine();
        System.out.println("Your rectangles width is: " + width);
    }
}
