package hexlet.code.Constants;

public enum Constants {
    ANSWER("Your answer: "),
    CONGRATULATIONS("Congratulations, "),
    QUESTION("Question:"),
    CORRECT("Correct!"),
    WRONG_ANSWER("' is wrong answer ;(. Correct answer was '"),
    INCORRECT("Let's try again, ");

    String message;

    Constants(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
