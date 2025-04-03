package hexlet.code.games;

import java.util.Random;

public class Progression {

    public static final String gameRule = "What number is missing in the progression?";
    final static int membersCount = 10;
    final static int boundDelta = 5;

    public static String[][] prepareGame(int rounds) {
        String[][] questions = new String[rounds][2];
        Random rand = new Random();
        var boundNumberOfEl = membersCount - 1;
        for (int i = 0; i < rounds; i++) {
            int number0 = rand.nextInt(boundNumberOfEl) + 1;
            int pos = rand.nextInt(boundNumberOfEl) + 1;
            int delta = rand.nextInt(boundDelta) + 1;
            String rightAnswer = "";
            StringBuilder elements = new StringBuilder();
            elements.append("Question: ");
            elements.append(number0);
            for (int j = 1; j < membersCount; j++) {
                elements.append(" ");
                if (j == pos) {
                    elements.append("..");
                    rightAnswer = Integer.toString(number0 + delta * j);
                } else {
                    elements.append(number0 + delta * j);
                }
            }
            questions[i][0] = elements.toString();
            questions[i][1] = rightAnswer;
        }
        return questions;
    }
}

