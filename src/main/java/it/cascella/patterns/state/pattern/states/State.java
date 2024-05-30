package it.cascella.patterns.state.pattern.states;

public interface State {
    void startWorking();
    void endWorking();
    void startTesting();
    void testFailed();
    void testPassed();
}
