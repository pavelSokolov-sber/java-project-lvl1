package hexlet.code.Games;

import hexlet.code.Engine.GameAlgorithm;
import hexlet.code.Engine.Question;

public class EventGame extends GameAlgorithm {

    public Question getQuestion() {
        int task = (int) (Math.random() * Integer.MAX_VALUE);
        String expectedResult = task % 2 == 0 ? "yes" : "no";
        return new Question(String.valueOf(task), expectedResult);
    }
}
