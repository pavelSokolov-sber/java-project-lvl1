package hexlet.code.Games;

import hexlet.code.Config.GameConfig;
import hexlet.code.Engine.GameAlgorithm;
import hexlet.code.Engine.Question;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProgressionGame extends GameAlgorithm {
    public Question getQuestion() {
        List<Integer> progression = getProgression();
        int randomPosition = (int) (Math.random() * (GameConfig.PROGRESSION_LENGTH - 1));
        int expectedResult = progression.get(randomPosition);
        List<String> task = progression
                .stream()
                .map(item -> item == expectedResult ? ".." : String.valueOf(item))
                .collect(Collectors.toList());
        return new Question(String.join(" ", task), String.valueOf(expectedResult));
    }

    private List<Integer> getProgression() {
        List<Integer> progression = new ArrayList<>();
        progression.add((int) (Math.random() * 50));
        int coefficient = (int) (Math.random() * GameConfig.PROGRESSION_COEFFICIENT) + 1;
        for (int i = 1; i < GameConfig.PROGRESSION_LENGTH; i++) {
            progression.add(progression.get(i - 1) + coefficient);
        }
        return progression;
    }
}
