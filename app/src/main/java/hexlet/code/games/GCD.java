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

    public static void playGCD(int rounds) {
        String userName = Engine.sayGameRules("Find the greatest common divisor of given numbers.");
        String[] questions = new String[rounds];
        String[] rightAnswers = new String[rounds];
        final int boundGame = 100;
        Random rand = new Random();
        for (int i = 0; i < rounds; i++) {
            int int1 = rand.nextInt(boundGame);
            int int2 = rand.nextInt(boundGame);
            questions[i] = "Question: " + int1 + " " + int2;
            rightAnswers[i] = Integer.toString(countGCD(int1, int2));
        }
        Engine.startGame(questions, rightAnswers, userName);
    }


}
