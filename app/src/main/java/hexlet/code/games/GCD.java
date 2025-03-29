package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class GCD {
    public static int countGCD(int a, int b) {
        while (b != 0) {
            int c = a % b;
            a = b;
            b = c;
        }
        return a;
    }

    public static void beginGCD() {
        String userName = Engine.sayHello("Find the greatest common divisor of given numbers.");

        boolean wasSuccess = true;
        boolean result;
        Random rand = new Random();
        for (int i = 0; i < 3; i++) {
            int int1 = rand.nextInt(100);
            int int2 = rand.nextInt(100);
            String questionStr = "Question: " + int1 + " " + int2;
            String rightAnswer = Integer.toString(countGCD(int1, int2));
            result = Engine.askQuestion(questionStr, rightAnswer, userName);
            if (!result) {
                wasSuccess = false;
                break;
            }

        }
        Engine.finishGame(wasSuccess, userName);
    }
}
