package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int ROUNDS = 3;

    public static String sayHello() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner myObj = new Scanner(System.in);
        String userName = myObj.nextLine();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }
    public static void playGame(String[][] questions, String gameRule) {
        String userName = sayHello();
        System.out.println(gameRule);
        Scanner scanNumbers = new Scanner(System.in);
        for (int i = 0; i < ROUNDS; i++) {
            String questionStr = questions[i][0];
            String rightAnswer = questions[i][1];
            System.out.println("Question: " + questionStr);
            System.out.print("Your answer: ");
            String userAnswer = scanNumbers.nextLine();
            if (userAnswer.equals(rightAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                        + rightAnswer + "'.");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
