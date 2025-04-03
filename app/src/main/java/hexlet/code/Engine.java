package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static void playGame(String[][] questions, String gameRuler) {
        String userName = Cli.sayHello();
        System.out.println(gameRuler);
        boolean wasSuccess = true;
        boolean result;
        for (int i = 0; i < questions.length; i++) {
            String questionStr = questions[i][0];
            String rightAnswer = questions[i][1];
            System.out.println("Question: " + questionStr);
            System.out.print("Your answer: ");
            Scanner scanNumbers = new Scanner(System.in);
            String userAnswer = scanNumbers.nextLine();
            if (userAnswer.equals(rightAnswer)) {
                System.out.println("Correct!");
                result = true;
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                        + rightAnswer + "'.");
                result = false;
            }
            if (!result) {
                wasSuccess = false;
                break;
            }
        }
        if (wasSuccess) {
            System.out.println("Congratulations, " + userName + "!");
        } else {
            System.out.println("Let's try again, " + userName + "!");
        }
    }
}
