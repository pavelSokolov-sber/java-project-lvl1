package hexlet.code.Games;

import java.util.Scanner;

public class EvenGame implements GameUtil {
    @Override
    public void startGame(String userName) {
        int correctAnswers = 0;
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        while (correctAnswers < 3) {
            int question = (int) (Math.random() * 100);
            boolean isEven = question % 2 == 0;
            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            System.out.println(input);
            if ((isEven && input.equals("yes")) || (!isEven && input.equals("no"))) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                System.exit(0);
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
