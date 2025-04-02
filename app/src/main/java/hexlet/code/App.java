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
        int choice = Integer.parseInt(userChoice);
        var rounds = 3;
        switch (choice) {
            case 1:
                Cli.sayHello();
                break;
            case 2:
                Even.playEven(rounds);
                break;
            case 3:
                Calc.playCalc(rounds);
                break;
            case 4:
                GCD.playGCD(rounds);
                break;
            case 5:
                Progression.playProgression(rounds);
                break;
            case 6:
                Prime.playPrime(rounds);
                break;
            default:
                break;
        }

    }

}
