package com.graylog.gclient.interpreter.command;

import com.graylog.gclient.interpreter.ExecutionResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("GClientExit")
public class GClientExit implements GClientCommand {
    private static final String COMMAND_PREFIX="exit";
    private static Logger LOG = LoggerFactory.getLogger(GClientExit.class);
    private GClientCommand nextCommand;

    @Autowired
    public GClientExit(@Qualifier("GClientHelp") GClientCommand nextCommand) {
        this.nextCommand = nextCommand;
    }

    @Override
    public boolean matches(String commandInStringFormat) {
        return COMMAND_PREFIX.equalsIgnoreCase(commandInStringFormat);
    }

    @Override
    public ExecutionResult execute(String commandInStringFormat) {
        LOG.info(String.format("was executed for '%s'", commandInStringFormat));
        return new ExecutionResult();
    }

    @Override
    public GClientCommand getNext() {
        return nextCommand;
    }

    @Override
    public boolean isTerminal() {
        return true;
    }
}
