package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Even;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        Scanner userScanner = new Scanner(System.in);
        String userChoice = userScanner.nextLine();
        final int rounds = 3;
        String[][] questions;
        switch (userChoice) {
            case "1":
                Cli.sayHello();
                break;
            case "2":
                questions = Even.prepareGame(rounds);
                Engine.playGame(questions, Even.gameRule);
                break;
            case "3":
                questions = Calc.prepareGame(rounds);
                Engine.playGame(questions, Calc.gameRule);
                break;
            case "4":
                questions = GCD.prepareGame(rounds);
                Engine.playGame(questions, GCD.gameRule);
                break;
            case "5":
                questions = Progression.prepareGame(rounds);
                Engine.playGame(questions, Progression.gameRule);
                break;
            case "6":
                questions = Prime.prepareGame(rounds);
                Engine.playGame(questions, Prime.gameRule);
                break;
            default:
                break;
        }

    }

}
