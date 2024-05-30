package it.cascella.patterns.state.pattern;

import it.cascella.patterns.state.pattern.states.State;
import it.cascella.patterns.state.pattern.states.TodoState;

public class Task  {
    private State state;

    public Task() {
        this.state = new TodoState(this);
    }

    public void startWorking(){
        state.startWorking();
    }
    public void endWorking(){
        state.endWorking();
    }
    public void startTesting(){
        state.startTesting();
    }
    public void testFailed(){
        state.testFailed();
    }
    public void testPassed(){
        state.testPassed();
    }
    public void changeState(State state){
        this.state = state;
    }
}
