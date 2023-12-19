package it.cascella.patterns.command.step4_full_example.commands;

public interface Command {
    void execute();

    void undo();
}
