package com.graylog.gclient.interpreter.command;

import com.graylog.gclient.interpreter.ExecutionResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("GClientUnknown")
public class GClientUnknown implements GClientCommand {
    private static Logger LOG = LoggerFactory.getLogger(GClientUnknown.class);

    @Override
    public boolean matches(String commandInStringFormat) {
        return true;
    }

    @Override
    public ExecutionResult execute(String commandInStringFormat) {
        LOG.info(String.format("was executed for '%s'", commandInStringFormat));
        return new ExecutionResult("Unknown command");
    }

    @Override
    public GClientCommand getNext() {
        return null;
    }

    @Override
    public boolean isTerminal() {
        return false;
    }
}
