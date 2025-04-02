package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String sayHello() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner myObj = new Scanner(System.in);
        String userName = myObj.nextLine();
        System.out.println("Hello, " + userName + "!");
        return userName;

    }
}
