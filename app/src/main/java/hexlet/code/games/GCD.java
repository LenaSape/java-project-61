package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GCD {

    public static final String GAMERULE = "Find the greatest common divisor of given numbers.";

    public static int countGCD(int a, int b) {
        while (b != 0) {
            int c = a % b;
            a = b;
            b = c;
        }
        return a;
    }

    public static void play() {
        String[][] questions = new String[Engine.ROUNDS][2];
        final int boundGame = 100;
        Random rand = new Random();
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int int1 = rand.nextInt(boundGame);
            int int2 = rand.nextInt(boundGame);
            questions[i][0] = "Question: " + int1 + " " + int2;
            questions[i][1] = Integer.toString(countGCD(int1, int2));
        }
        Engine.playGame(questions, GAMERULE);
    }

}
