package hexlet.code.games;

import java.util.Random;

public class Prime {

    public static final String GAMERULE = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

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

    public static String[][] prepareGame(int rounds) {
        String[][] questions = new String[rounds][2];
        Random rand = new Random();
        final int boundGame = 50;
        for (int i = 0; i < rounds; i++) {
            int number = rand.nextInt(boundGame);
            questions[i][0] = "Question: " + number;
            questions[i][1] = definePrime(number);
        }
        return questions;
    }
}
