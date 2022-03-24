package com.graylog.gclient.interpreter.command;

import com.graylog.gclient.interpreter.ExecutionResult;

public interface GClientCommand {
    boolean matches(String commandInStringFormat);

    ExecutionResult execute(String commandInStringFormat);

    GClientCommand getNext();

    boolean isTerminal();
}
