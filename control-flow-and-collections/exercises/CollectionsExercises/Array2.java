package CollectionsExercises;

public class Array2 {
    public static void main(String[] args) {
        String inputString = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

        // Split the input string at each space
        String[] wordsArray = inputString.split(" ");

        // Print each word in the array
        for (String word : wordsArray) {
            System.out.println(word);
        }
    }
}
