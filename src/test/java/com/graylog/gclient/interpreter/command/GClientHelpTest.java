package com.graylog.gclient.interpreter.command;

import com.graylog.gclient.interpreter.ExecutionResult;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GClientHelpTest extends GClientTest {
    @Autowired
    GClientHelp victim;

    @Test
    public void matchesTest() {
        assertEquals(true, victim.matches("help"));
    }

    @Test
    public void executeTest() {
        ExecutionResult executionResult = new ExecutionResult();
        ExecutionResult actualResult = victim.execute("help");
        assertEquals(executionResult.isExecuted(), actualResult.isExecuted());
    }

    @Test
    public void getNextTest() {
        assertEquals(true, victim.getNext() instanceof GClientLoad);
    }

    @Test
    public void isTerminalTest() {
        assertEquals(false, victim.isTerminal());
    }
}
