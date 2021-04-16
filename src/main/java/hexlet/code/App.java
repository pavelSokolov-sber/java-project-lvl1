package hexlet.code;

import hexlet.code.Engine.GameAlgorithm;
import hexlet.code.Games.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        GameAlgorithm game;
        String choice = getChoice();
        if (choice.equals("1")) {
            new GreetGame().greeting();
        } else {
            String userName = new GreetGame().greeting();
            switch (choice) {
                case "2":
                    game = new EventGame();
                    game.startGame(userName);
                    break;
                case "3":
                    game = new CalcGame();
                    game.startGame(userName);
                    break;
                case "4":
                    game = new GCDGame();
                    game.startGame(userName);
                    break;
                case "5":
                    game = new ProgressionGame();
                    game.startGame(userName);
                    break;
                case "6":
                    game = new PrimeGame();
                    game.startGame(userName);
                    break;
            }
        }
    }

    private static String getChoice() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
