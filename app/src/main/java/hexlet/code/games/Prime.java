package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Prime {

    public static final String GAME_RULE = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static boolean isPrime(int a) {
        if (a <= 1) {
            return false;
        }
        for (int i = 2; i < a; i++) {
            if ((a % i) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void play() {
        String[][] questions = new String[Engine.ROUNDS][2];
        Random rand = new Random();
        final int boundGame = 50;
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int number = rand.nextInt(boundGame);
            questions[i][0] = Integer.toString(number);
            questions[i][1] = isPrime(number) ? "yes" : "no";
        }
        Engine.playGame(questions, GAME_RULE);
    }
}
