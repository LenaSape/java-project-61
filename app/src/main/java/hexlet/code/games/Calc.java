package hexlet.code.games;

import java.util.Random;

public class Calc {

    public static final String gameRule = "What is the result of the expression?";

    public static String[][] prepareGame(int rounds) {
        String[][] questions = new String[rounds][2];
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
            questions[i][0] = int1 + " " + charSign + " " + int2;
            questions[i][1] = Integer.toString(intResult);
        }
        return questions;
    }
}
