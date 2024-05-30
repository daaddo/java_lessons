package it.cascella.patterns.state.pattern.states;

import it.cascella.patterns.state.pattern.Task;

public class TodoState implements State{
    private Task task;

    public TodoState(Task task) {
        this.task = task;
    }

    @Override
    public void startWorking() {
        this.task.changeState(new InProgressState(task));
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
        throw new IllegalStateException();
    }

    @Override
    public void testPassed() {
        throw new IllegalStateException();
    }
}
