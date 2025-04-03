package hexlet.code.games;

import java.util.Random;

public class Even {

    public static final String GAMERULE = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static String[][] prepareGame(int rounds) {
        String[][] questions = new String[rounds][2];
        Random rand = new Random();
        final int boundGame = 100;
        for (int i = 0; i < rounds; i++) {
            int x = rand.nextInt(boundGame);
            questions[i][0] = "Question: " + x;
            questions[i][1] = (x % 2 == 0) ? "yes" : "no";
        }
        return questions;
    }
}
