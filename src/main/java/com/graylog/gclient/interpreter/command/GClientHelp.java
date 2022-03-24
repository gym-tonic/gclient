package com.graylog.gclient.interpreter.command;

import com.graylog.gclient.interpreter.ExecutionResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("GClientHelp")
public class GClientHelp implements GClientCommand {
    private static Logger LOG = LoggerFactory.getLogger(GClientHelp.class);
    private static final String COMMAND_PREFIX = "help";
    private GClientCommand nextCommand;

    @Autowired
    public GClientHelp(@Qualifier("GClientLoad") GClientCommand nextCommand) {
        this.nextCommand = nextCommand;
    }

    @Override
    public boolean matches(String commandInStringFormat) {
        return COMMAND_PREFIX.equalsIgnoreCase(commandInStringFormat);
    }

    @Override
    public ExecutionResult execute(String commandInStringFormat) {
        LOG.info(String.format("was executed for '%s'", commandInStringFormat));
        System.out.println("$ The only command implemented is: 1) load <pathToTextFileWithGraylogMessages> and 2) exit");
        return new ExecutionResult();
    }

    @Override
    public GClientCommand getNext() {
        return nextCommand;
    }

    @Override
    public boolean isTerminal() {
        return false;
    }
}
