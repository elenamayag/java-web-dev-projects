package CollectionsExercises;

public class Array3 {
    public static void main(String[] args) {
        String inputString = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

        // Split the input string at each period followed by a space
        String[] sentencesArray = inputString.split("\\. ");

        // Print each sentence in the array
        for (String sentence : sentencesArray) {
            System.out.println(sentence);
        }
    }
}
