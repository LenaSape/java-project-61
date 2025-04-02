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


    public static void playPrime(int rounds) {
        String userName = Engine.sayGameRules("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        String[] questions = new String[rounds];
        String[] rightAnswers = new String[rounds];
        Random rand = new Random();
        final int boundGame = 50;
        for (int i = 0; i < rounds; i++) {
            int number = rand.nextInt(boundGame);
            questions[i] = "Question: " + number;
            rightAnswers[i] = definePrime(number);
        }
        Engine.startGame(questions, rightAnswers, userName);
    }
}
