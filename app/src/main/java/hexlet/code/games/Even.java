package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Even {
    public static void beginEven() {
        //System.out.println("Calc");
        String userName = Engine.sayHello("Answer 'yes' if the number is even, otherwise answer 'no'.");

        boolean wasSuccess = true;
        boolean result;
        Random rand = new Random();
        for (int i = 0; i < 3; i++) {
            int x = rand.nextInt(100);
            String questionStr = "Question: " + x;
            String rightAnswer = (x % 2 == 0) ? "yes" : "no";
            result = Engine.askQuestion(questionStr, rightAnswer, userName);
            if (!result) {
                wasSuccess = false;
                break;
            }

        }
        Engine.finishGame(wasSuccess, userName);
    }
}
