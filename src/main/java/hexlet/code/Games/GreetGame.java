package hexlet.code.Games;

import java.util.Scanner;

public class GreetGame {
    public String greeting() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = new Scanner(System.in).nextLine();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }
}
