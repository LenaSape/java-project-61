package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Calc {

    public static final String GAMERULE = "What is the result of the expression?";

    public static int calcInt(char sign, int int1, int int2) {
        switch (sign) {
            case '-':
                return (int1 - int2);
            case '*':
                return int1 * int2;
            default:
                return (int1 + int2);
        }
    }

    public static void play() {
        String[][] questions = new String[Engine.ROUNDS][2];
        final int boundGame = 100;
        final int numberOfOps = 3;
        Random rand = new Random();
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int int1 = rand.nextInt(boundGame);
            int int2 = rand.nextInt(boundGame);
            int intSign = rand.nextInt(numberOfOps);
            int intResult;
            char charSign;
            switch (intSign) {
                case 1:
                    intResult = calcInt('-', int1, int2);
                    charSign = '-';
                    break;
                case 2:
                    intResult = calcInt('*', int1, int2);
                    charSign = '*';
                    break;
                default:
                    intResult = calcInt('+', int1, int2);
                    charSign = '+';
            }
            questions[i][0] = int1 + " " + charSign + " " + int2;
            questions[i][1] = Integer.toString(intResult);
        }
        Engine.playGame(questions, GAMERULE);
    }
}
