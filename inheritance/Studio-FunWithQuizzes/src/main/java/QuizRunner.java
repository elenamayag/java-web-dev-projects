import questions.*;

public class QuizRunner {

    private static final Quiz quiz = new Quiz();

    public static void main(String[] args) {

        String q1 = "Which of the following are books by Jane Austen?";
        Choice[] q1Choices = new Choice[] {
                new Choice("Jane Erye"),
                new Choice("Pride and Prejudice", true),
                new Choice("Wive and Daughters"),
                new Choice("Mansfield Park", true)
        };
        Checkbox question1 = new Checkbox(q1, q1Choices);

        String q2 = "The most-published author of all time is Agatha Christie.";
        Choice[] q2Choices = new Choice[] {
                new Choice("True", true),
                new Choice("False")
        };
        TrueOrFalse question2 = new TrueOrFalse(q2, q2Choices);

        String q3 = "Which song is sung by Miley Cyrus?";
        Choice[] q3Choices = new Choice[] {
                new Choice("The Climb", true),
                new Choice("If I Were A Boy"),
                new Choice("Tequila Does"),
                new Choice("Goodies")
        };
        MultipleChoice question3 = new MultipleChoice(q3, q3Choices);

        quiz.addQuestions(new Question[] { question1, question2, question3 });

        quiz.run();

        String newline = System.lineSeparator();
        System.out.println(newline + "You answered " + quiz.getNumCorrect() +
                " of " + quiz.getQuestions().size() +
                " questions correctly. Thanks for playing!" + newline);

    }
}
