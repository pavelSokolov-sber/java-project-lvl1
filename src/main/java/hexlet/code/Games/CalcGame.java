package hexlet.code.Games;

import hexlet.code.Config.GameConfig;
import hexlet.code.Engine.GameAlgorithm;
import hexlet.code.Engine.Question;

import java.util.Arrays;
import java.util.List;

public class CalcGame extends GameAlgorithm {
    public Question getQuestion() {
        String action = GameConfig.actions[(int) (Math.random() * 3)];
        int num1 = (int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 10);
        int expectedResult = calculateResult(action, num1, num2);
        List<String> question = Arrays.asList(String.valueOf(num1), action, String.valueOf(num2));
        return new Question(String.join(" ", question), String.valueOf(expectedResult));
    }

    private int calculateResult(String action, int num1, int num2) {
        switch (action) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            default:
                return num1 * num2;
        }
    }
}
