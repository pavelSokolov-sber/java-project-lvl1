package hexlet.code;

import hexlet.code.Engine.GameAlgorithm;
import hexlet.code.Games.CalcGame;
import hexlet.code.Games.EventGame;
import hexlet.code.Games.GreetGame;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        GameAlgorithm game;
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        if (choice.equals("1")) {
            new GreetGame().greeting();
        } else {
            String userName = new GreetGame().greeting();
            if (choice.equals("2")) {
                game = new EventGame();
                game.startGame(userName);
            } else if (choice.equals("3")) {
                game = new CalcGame();
                game.startGame(userName);
            }
        }
    }
}
