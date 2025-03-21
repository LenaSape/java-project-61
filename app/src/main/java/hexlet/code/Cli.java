package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void sayHello() {
        System.out.print("May I have your name? ");
        Scanner myObj = new Scanner(System.in);
        String userName = myObj.nextLine();
        System.out.println("Hello, " + userName + "!");

    }
}
