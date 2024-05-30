package it.cascella.patterns.state.pattern.states;

import it.cascella.patterns.state.pattern.Task;

public class InProgressState implements State{
    private Task task;

    public InProgressState(Task task) {
        this.task = task;
    }
    @Override
    public void startWorking() {
        throw new IllegalStateException();
    }

    @Override
    public void endWorking() {
        System.out.println("Task ended");
        this.task.changeState(new DoneState(task));
    }

    @Override
    public void startTesting() {
        this.task.changeState(new TestingState(task));
    }

    @Override
    public void testFailed() {
        throw new IllegalStateException();
    }

    @Override
    public void testPassed() {
        throw new IllegalStateException();
    }
}
