package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Calc {

    public static final String GAME_RULE = "What is the result of the expression?";

    public static int calcInt(char sign, int int1, int int2) {
        switch (sign) {
            case '+':
                return (int1 + int2);
            case '-':
                return (int1 - int2);
            case '*':
                return int1 * int2;
            default:
                throw new RuntimeException("Wrong symbol of operation: " + sign);
        }
    }

    public static void play() {
        String[][] questions = new String[Engine.ROUNDS][2];
        final int boundGame = 100;
        final char[] operations = {'+', '-', '*'};
        Random rand = new Random();
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int int1 = rand.nextInt(boundGame);
            int int2 = rand.nextInt(boundGame);
            int operationNum = rand.nextInt(operations.length);
            int intResult = calcInt(operations[operationNum], int1, int2);
            questions[i][0] = int1 + " " + operations[operationNum] + " " + int2;
            questions[i][1] = Integer.toString(intResult);
        }
        Engine.playGame(questions, GAME_RULE);
    }
}
