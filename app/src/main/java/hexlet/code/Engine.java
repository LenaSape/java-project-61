package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static String sayGameRules(String gameQuestion) {
        String userName = Cli.sayHello();
        System.out.println(gameQuestion);
        return userName;
    }

    public static boolean askQuestion(String question, String rightAnswer) {
        System.out.println("Question: " + question);
        System.out.print("Your answer: ");
        Scanner scanNumbers = new Scanner(System.in);
        String userAnswer = scanNumbers.nextLine();
        if (userAnswer.equals(rightAnswer)) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                    + rightAnswer + "'.");
            return false;
        }
    }

    public static void finishGame(boolean wasSuccess, String userName) {
        if (wasSuccess) {
            System.out.println("Congratulations, " + userName + "!");
        } else {
            System.out.println("Let's try again, " + userName + "!");
        }
    }

    public static void startGame(String[] questions, String[] rightAnswers, String userName) {
        boolean wasSuccess = true;
        boolean result;
        for (int i = 0; i < questions.length; i++) {
            String questionStr = questions[i];
            String rightAnswer = rightAnswers[i];
            result = Engine.askQuestion(questionStr, rightAnswer);
            if (!result) {
                wasSuccess = false;
                break;
            }
        }
        Engine.finishGame(wasSuccess, userName);
    }
}
