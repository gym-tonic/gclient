package com.graylog.gclient.interpreter.command;

import com.graylog.gclient.interpreter.ExecutionResult;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GClientExitTest extends GClientTest {

    @Autowired
    GClientExit victim;

    @Test
    public void matchesTest() {
        assertEquals(true, victim.matches("exit"));
    }

    @Test
    public void executeTest() {
        ExecutionResult expected = new ExecutionResult();
        ExecutionResult actual = victim.execute("exit");
        assertEquals(expected.isExecuted(), actual.isExecuted());
    }

    @Test
    public void getNextTest() {
        assertEquals(true, victim.getNext() instanceof GClientHelp);
    }

    @Test
    public void isTerminalTest() {
        assertEquals(true, victim.isTerminal());
    }
}
