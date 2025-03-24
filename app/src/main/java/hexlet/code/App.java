package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        Scanner userScanner = new Scanner(System.in);
        String userChoice = userScanner.nextLine();
        //System.out.println(userChoice);
        if (!userChoice.equals("1")) {
            return;
        }
        System.out.println("");
        System.out.println("Welcome to the Brain Games!");
        Cli.sayHello();
    }
}
