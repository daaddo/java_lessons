package it.cascella.patterns.state.pattern.states;

import it.cascella.patterns.state.pattern.Task;

public class TestingState implements State{
    private Task task;

    public TestingState(Task task) {
        this.task = task;
    }
    @Override
    public void startWorking() {
        throw new IllegalStateException();

    }

    @Override
    public void endWorking() {
        throw new IllegalStateException();

    }

    @Override
    public void startTesting() {
        throw new IllegalStateException();
    }

    @Override
    public void testFailed() {
        this.task.changeState(new InProgressState(task));
    }

    @Override
    public void testPassed() {
        System.out.println("Test passed");
        this.task.changeState(new DoneState(task));

    }
}
