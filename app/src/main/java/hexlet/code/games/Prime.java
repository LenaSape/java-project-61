package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Prime {
    public static String definePrime(int a) {
        if (a <= 1) {
            return "no";
        }
        for (int i = 2; i < a; i++) {
            if ((a % i) == 0) {
               return "no";
            }
        }
        return "yes";
    }

    public static void beginPrime() {
        String userName = Engine.sayHello("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        boolean wasSuccess = true;
        boolean result;
        Random rand = new Random();
        for (int i = 0; i < 3; i++) {
            int number = rand.nextInt(50);
            String questionStr = "Question: " + number;
            String rightAnswer = definePrime(number);
            result = Engine.askQuestion(questionStr, rightAnswer, userName);
            if (!result) {
                wasSuccess = false;
                break;
            }
        }
        Engine.finishGame(wasSuccess, userName);
    }
}
