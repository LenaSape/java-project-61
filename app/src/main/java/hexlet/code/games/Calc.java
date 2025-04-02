package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Calc {

    public static void playCalc(int rounds) {
        String userName = Engine.sayGameRules("What is the result of the expression?");
        String[] questions = new String[rounds];
        String[] rightAnswers = new String[rounds];
        final int boundGame = 100;
        final int numberOfOps = 3;
        Random rand = new Random();
        for (int i = 0; i < rounds; i++) {
            int int1 = rand.nextInt(boundGame);
            int int2 = rand.nextInt(boundGame);
            int intSign = rand.nextInt(numberOfOps);
            int intResult;
            char charSign;
            switch (intSign) {
                case 1:
                    intResult = int1 - int2;
                    charSign = '-';
                    break;
                case 2:
                    intResult = int1 * int2;
                    charSign = '*';
                    break;
                default:
                    intResult = int1 + int2;
                    charSign = '+';
            }
            questions[i] = int1 + " " + charSign + " " + int2;
            rightAnswers[i] = Integer.toString(intResult);
        }
        Engine.startGame(questions, rightAnswers, userName);
    }
}
