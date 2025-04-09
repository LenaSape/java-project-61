package hexlet.code.games;

import java.util.Random;
import hexlet.code.Engine;

public class Even {

    public static final String GAME_RULE = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static boolean isEven(int number) {
        return (number % 2 == 0);
    }

    public static void play() {
        String[][] questions = new String[Engine.ROUNDS][2];
        Random rand = new Random();
        final int boundGame = 100;
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int x = rand.nextInt(boundGame);
            questions[i][0] = Integer.toString(x);
            questions[i][1] = isEven(x) ? "yes" : "no";
        }
        Engine.playGame(questions, GAME_RULE);
    }

}
