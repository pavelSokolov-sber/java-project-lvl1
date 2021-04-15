package hexlet.code.Engine;

public class Question {
    private String task;

    private String expectedResult;

    public Question(String task, String expectedResult) {
        this.task = task;
        this.expectedResult = expectedResult;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getExpectedResult() {
        return expectedResult;
    }

    public void setExpectedResult(String expectedResult) {
        this.expectedResult = expectedResult;
    }
}
