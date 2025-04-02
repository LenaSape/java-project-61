package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Even {

    public static void playEven(int rounds) {
        String userName = Engine.sayGameRules("Answer 'yes' if the number is even, otherwise answer 'no'.");
        String[] questions = new String[rounds];
        String[] rightAnswers = new String[rounds];
        Random rand = new Random();
        var boundGame = 100;
        for (int i = 0; i < rounds; i++) {
            int x = rand.nextInt(boundGame);
            questions[i] = "Question: " + x;
            rightAnswers[i] = (x % 2 == 0) ? "yes" : "no";
        }
        Engine.startGame(questions, rightAnswers, userName);
    }
}
