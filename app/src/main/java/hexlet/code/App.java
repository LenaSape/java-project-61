package hexlet.code;

import hexlet.code.games.Calc;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        Scanner userScanner = new Scanner(System.in);
        String userChoice = userScanner.nextLine();
        int choice = Integer.parseInt(userChoice);
        switch (choice) {
            case 0:
                return;
            case 1:
                sayHelloUser();
                break;
            case 2:
                Even.sayEven();
                break;
            case 3:
                Calc.beginCalc();
                //Even.sayEven();
                break;
            default:
                //return;
        }

    }

    public static void sayHelloUser() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner myObj = new Scanner(System.in);
        String userName = myObj.nextLine();
        System.out.println("Hello, " + userName + "!");
    }
}
