package hexlet.code.Games;

import hexlet.code.Engine.GameAlgorithm;
import hexlet.code.Engine.Question;

import java.util.Arrays;
import java.util.List;

public class CalcGame extends GameAlgorithm {
    private final String[] actions = {"+", "-", "*"};

    public Question getQuestion() {
        String action = actions[(int) (Math.random() * 3)];
        int num1 = (int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 10);
        int expectedResult;
        switch (action) {
            case "+":
                expectedResult = num1 + num2;
                break;
            case "-":
                expectedResult = num1 - num2;
                break;
            default:
                expectedResult = num1 * num2;
                break;
        }
        List<String> question = Arrays.asList(String.valueOf(num1), action, String.valueOf(num2));

        return new Question(String.join(" ", question), String.valueOf(expectedResult));
    }
}
