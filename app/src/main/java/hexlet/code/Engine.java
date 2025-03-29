package hexlet.code;

import java.util.Scanner;

public class Engine {
    
    public static String sayHello(String gameQuestion ) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner myObj = new Scanner(System.in);
        String userName = myObj.nextLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println(gameQuestion);
        return userName;
    }

    public static boolean askQuestion(String question, String rightAnswer, String userName) {
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

    public static void finishGame(boolean result, String userName) {
        if (result) {
            System.out.println("Congratulations, " + userName + "!");
        } else {
            System.out.println("Let's try again, " + userName + "!");
        }
    }
}
