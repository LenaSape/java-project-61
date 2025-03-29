package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Calc {
    public static void beginCalc() {
        System.out.println("Calc");
        String userName = Engine.sayHello("What is the result of the expression?");

        boolean wasSuccess = true;
        boolean result;
        Random rand = new Random();
        for(int i = 0; i < 3; i++) {
            int int1 = rand.nextInt(100);
            int int2 = rand.nextInt(100);
            int intSign = rand.nextInt(3);
            int intResult = 0;
            char charSign = '+';
            switch (intSign) {
                case 0:
                    intResult = int1 + int2;
                    charSign = '+';
                    break;
                case 1:
                    intResult = int1 - int2;
                    charSign = '-';
                    break;
                case 2:
                    intResult = int1 * int2;
                    charSign = '*';
                    break;
            }
            String questionStr = int1 + " " + charSign + " " + int2;
            //System.out.println(intResult);
            String rightAnswer = Integer.toString(intResult);
            result = Engine.askQuestion(questionStr, rightAnswer, userName);
            if (!result) {
                wasSuccess = false;
                break;
            }

        }
        Engine.finishGame(wasSuccess, userName);
    }
}
