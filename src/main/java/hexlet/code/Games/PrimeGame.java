package hexlet.code.Games;

import hexlet.code.Engine.GameAlgorithm;
import hexlet.code.Engine.Question;

public class PrimeGame extends GameAlgorithm {
    public Question getQuestion() {
        int task = (int) (Math.random() * 20);
        String expectedResult = "yes";
        for (int i = 2; i < task; i++) {
            if (task % i == 0) {
                expectedResult = "no";
                break;
            }
        }
        return new Question(String.valueOf(task), expectedResult);
    }
}
