package com.graylog.gclient.interpreter;

import com.graylog.gclient.interpreter.command.GClientTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class GClientInterpreterTest extends GClientTest {

    @Autowired
    GClientInterpreter victim;

    @Test
    public void interpretCommandExit() {
        assertTrue(victim.interpretCommand("exit"));
    }

    @Test
    public void interpretCommandHelp() {
        assertFalse(victim.interpretCommand("help"));
    }

}
