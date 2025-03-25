package hexlet.code;

import java.util.Scanner;
import java.util.Random;

public class Even {
    public static void sayEven() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner myObj = new Scanner(System.in);
        String userName = myObj.nextLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Random rand = new Random();
        int randomInt;
        boolean wasSuccess = true;
        for (int i = 0; i < 3; i++) {
            randomInt = rand.nextInt(100);
            System.out.println("Question: " + randomInt);
            System.out.print("Your answer: ");
            Scanner scanNumbers = new Scanner(System.in);
            String userAnswer = scanNumbers.nextLine();
            if ((userAnswer.equals("yes") && (randomInt % 2 == 0))
                    || (userAnswer.equals("no") && (randomInt % 2 != 0))) {
                System.out.println("Correct!");
            } else {
                String correctAnswer = (randomInt % 2 == 0) ? "yes" : "no";
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" +
                                    correctAnswer + "'.");
                System.out.println("Let's try again, " + userName + "!");
                wasSuccess = false;
                break;
            }
        }
        if (wasSuccess) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}
