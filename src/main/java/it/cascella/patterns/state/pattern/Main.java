package it.cascella.patterns.state.pattern;

public class Main {
    public static void main(String[] args) {
        Task task = new Task();
        task.startWorking();
        task.startTesting();
        task.testPassed();
    }
}
