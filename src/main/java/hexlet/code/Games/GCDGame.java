package hexlet.code.Games;

import hexlet.code.Engine.GameAlgorithm;
import hexlet.code.Engine.Question;

public class GCDGame extends GameAlgorithm {
    public Question getQuestion() {
        int num1 = (int) (Math.random() * Integer.MAX_VALUE);
        int num2 = (int) (Math.random() * Integer.MAX_VALUE);
        int correctResult = gcd(num1, num2);
        return new Question(num1 + " " + num2, String.valueOf(correctResult));
    }

    private int gcd(int num1, int num2) {
        return num1 == 0 ? num2 : gcd(num2 % num1, num1);
    }
}
