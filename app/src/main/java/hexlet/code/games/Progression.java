package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Progression {

    public static final String GAMERULE = "What number is missing in the progression?";
    private static final int MEMBERSCOUNT = 10;
    private static final int BOUNDDELTA = 5;

    public static int nextProgressElement(int startElement, int delta, int posElement) {
        return startElement + delta * posElement;
    }

    public static void play() {
        String[][] questions = new String[Engine.ROUNDS][2];
        Random rand = new Random();
        var boundNumberOfEl = MEMBERSCOUNT - 1;
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int number0 = rand.nextInt(boundNumberOfEl) + 1;
            int pos = rand.nextInt(boundNumberOfEl) + 1;
            int delta = rand.nextInt(BOUNDDELTA) + 1;
            String rightAnswer = "";
            StringBuilder elements = new StringBuilder();
            elements.append("Question: ");
            elements.append(number0);
            for (int j = 1; j < MEMBERSCOUNT; j++) {
                elements.append(" ");
                if (j == pos) {
                    elements.append("..");
                    rightAnswer = Integer.toString(nextProgressElement(number0, delta, j));
                } else {
                    elements.append(nextProgressElement(number0, delta, j));
                }
            }
            questions[i][0] = elements.toString();
            questions[i][1] = rightAnswer;
        }
        Engine.playGame(questions, GAMERULE);
    }
}

