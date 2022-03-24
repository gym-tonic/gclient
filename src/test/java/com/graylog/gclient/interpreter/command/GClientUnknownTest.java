package com.graylog.gclient.interpreter.command;

import com.graylog.gclient.interpreter.ExecutionResult;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class GClientUnknownTest extends GClientTest {

    @Autowired
    GClientUnknown victim;

    @Test
    public void matchesTest() {
        assertEquals(true, victim.matches("unknownCommand"));
    }

    @Test
    public void executeTest() {
        ExecutionResult expected = new ExecutionResult("Unknown command");
        ExecutionResult actual = victim.execute("unknownCommand");
        assertEquals(expected.getError(), actual.getError());
    }

    @Test
    public void getNextTest() {
        assertNull(victim.getNext());
    }

    @Test
    public void isTerminalTest() {
        assertEquals(false, victim.isTerminal());
    }

}
