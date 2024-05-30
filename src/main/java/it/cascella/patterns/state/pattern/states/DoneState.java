package it.cascella.patterns.state.pattern.states;

import it.cascella.patterns.state.pattern.Task;

public class DoneState implements State{
    private Task task;

    public DoneState(Task task) {
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
        throw new IllegalStateException();
    }

    @Override
    public void testPassed() {
        throw new IllegalStateException();
    }
}
