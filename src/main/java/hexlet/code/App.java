package hexlet.code;

import hexlet.code.Games.EvenGame;
import hexlet.code.Games.GameUtil;
import hexlet.code.Games.GreetGame;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        GameUtil gameUtil;
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        if (choice.equals("1")) {
            new GreetGame().greeting();
        } else {
            String userName = new GreetGame().greeting();
            if (choice.equals("2")) {
                gameUtil = new EvenGame();
                gameUtil.startGame(userName);
            }
        }
    }
}
