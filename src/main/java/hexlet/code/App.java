package hexlet.code;

import hexlet.code.Engine.GameAlgorithm;
import hexlet.code.Games.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        GameAlgorithm game = null;
        switch (getChoice()) {
            case "1":
                new GreetGame().greeting();
                System.exit(0);
            case "2":
                game = new EventGame();
                break;
            case "3":
                game = new CalcGame();
                break;
            case "4":
                game = new GCDGame();
                break;
            case "5":
                game = new ProgressionGame();
                break;
            case "6":
                game = new PrimeGame();
                break;
            default:
                System.exit(0);
        }
        game.startGame(new GreetGame().greeting());
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
        return new Scanner(System.in).nextLine();
    }
}
