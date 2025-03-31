package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Progression {

    public static void beginProgression() {
        String userName = Engine.sayHello("What number is missing in the progression?");

        boolean wasSuccess = true;
        boolean result;
        Random rand = new Random();
        for (int i = 0; i < 3; i++) {
            int number0 = rand.nextInt(8) + 1;
            int pos = rand.nextInt(8) + 1;
            int delta = rand.nextInt(5) + 1;
            String rightAnswer = "";
            StringBuilder elements = new StringBuilder();
            elements.append("Question: ");
            elements.append(number0);
            for (int j = 1; j < 10; j++) {
                elements.append(" ");
                if (j == pos) {
                    elements.append("..");
                    rightAnswer = Integer.toString(number0 + delta * j);
                } else {
                    elements.append(number0 + delta * j);
                }
                //elements.append(Integer.toString(number0 + delta * j));
            }
            String questionStr = elements.toString();
           //String rightAnswer = Integer.toString(12);
            result = Engine.askQuestion(questionStr, rightAnswer, userName);
            if (!result) {
                wasSuccess = false;
                break;
            }

        }
        Engine.finishGame(wasSuccess, userName);
    }
}
