package hexlet.code.Engine;

public class Question {
    private final String task;

    private final String expectedResult;

    public Question(String task, String expectedResult) {
        this.task = task;
        this.expectedResult = expectedResult;
    }

    public String getTask() {
        return task;
    }

    public String getExpectedResult() {
        return expectedResult;
    }
}
