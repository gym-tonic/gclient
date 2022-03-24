package com.graylog.gclient.interpreter.command;

import com.graylog.gclient.interpreter.ExecutionResult;
import com.graylog.gclient.parser.GraylogInputParser;
import com.graylog.gclient.parser.dto.LogDto;
import com.graylog.gclient.sender.GelfSender;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;

import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

public class GClientLoadTest extends GClientTest {

    @Autowired
    @InjectMocks
    GClientLoad victim;

    @Mock
    GraylogInputParser graylogInputParser;

    @Mock
    GelfSender gelfSender;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void matchesTest() {
        assertEquals(true, victim.matches("load /home/george"));
    }

    @Test
    public void executeOkTest() {
        List<LogDto> logs = Arrays.asList(new LogDto());
        String filePath = Paths.get("src/test/resources/test.txt").toAbsolutePath().toString();
        when(graylogInputParser.readFileFromPath(filePath)).thenReturn(logs);
        ExecutionResult expected = new ExecutionResult();
        ExecutionResult actual = victim.execute("load "+filePath);
        assertEquals(expected.isExecuted(), actual.isExecuted());
    }

    @Test
    public void executeWrongFilePathTest() {
        ExecutionResult actual = victim.execute("load abc");
        assertTrue(actual.getError().equals("Wrong file path 'abc'"));
    }

    @Test
    public void executeWrongArgumentNumberTest() {
        ExecutionResult actual = victim.execute("load a c ");
        assertTrue(actual.getError().equals("Command 'load a c ' has wrong number of arguments"));
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
