package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Progression {
    public static void playProgression(int rounds) {
        String userName = Engine.sayGameRules("What number is missing in the progression?");
        String[] questions = new String[rounds];
        String[] rightAnswers = new String[rounds];
        Random rand = new Random();
        final int boundDelta = 5;
        final int membersCount = 10;
        var boundNumberOfEl = membersCount - 1;
        for (int i = 0; i < rounds; i++) {
            int number0 = rand.nextInt(boundNumberOfEl) + 1;
            int pos = rand.nextInt(boundNumberOfEl) + 1;
            int delta = rand.nextInt(boundDelta) + 1;
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
            questions[i] = elements.toString();
            rightAnswers[i] = rightAnswer;
        }
        Engine.startGame(questions, rightAnswers, userName);
    }
}

