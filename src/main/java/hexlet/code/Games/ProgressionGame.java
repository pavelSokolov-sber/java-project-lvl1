package hexlet.code.Games;

import hexlet.code.Engine.GameAlgorithm;
import hexlet.code.Engine.Question;

public class ProgressionGame extends GameAlgorithm {
    public Question getQuestion() {
        int task = (int) (Math.random() * 100);
        boolean expectedResult = task % 2 == 0;
        return new Question(String.valueOf(task), String.valueOf(expectedResult));
    }
}
