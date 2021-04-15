package hexlet.code.Engine;

import hexlet.code.Config.GameConfig;
import hexlet.code.Constants.Constants;

import java.util.Scanner;

public abstract class GameAlgorithm {

    public void startGame(String userName) {
        int correctAnswers = 0;
        while (correctAnswers < GameConfig.MAX_CORRECT_ANSWERS) {
            Question question = getQuestion();
            System.out.println(Constants.QUESTION + " " + question.getTask());

            System.out.print(Constants.ANSWER.getMessage());
            Scanner scanner = new Scanner(System.in);
            String actualResult = scanner.nextLine();

            if (actualResult.equals(question.getExpectedResult())) {
                System.out.println(Constants.CORRECT.getMessage());
                correctAnswers++;
            } else {
                System.out.println("'" + actualResult + Constants.WRONG_ANSWER.getMessage() + question.getExpectedResult() + "'");
                System.out.println(Constants.INCORRECT.getMessage() + userName + "!");
                System.exit(0);
            }
        }
        System.out.println(Constants.CONGRATULATIONS.getMessage() + userName + "!");
    }

    public abstract Question getQuestion();
}
