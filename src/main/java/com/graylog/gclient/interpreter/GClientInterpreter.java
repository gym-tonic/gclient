package com.graylog.gclient.interpreter;

import com.graylog.gclient.interpreter.command.GClientCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import static com.graylog.gclient.utils.Utils.unifyCommand;

@Service
public class GClientInterpreter {
    private static Logger LOG = LoggerFactory.getLogger(GClientInterpreter.class);
    private GClientCommand startCommand;

    @Autowired
    public GClientInterpreter(@Qualifier("GClientExit") GClientCommand startCommand) {
        this.startCommand = startCommand;
    }
    public boolean interpretCommand(String... args) {
        String unifiedCommand = unifyCommand(args);
        LOG.info("EXECUTING : {}", unifiedCommand);

        GClientCommand command;
        for (command = startCommand; !command.matches(unifiedCommand); command = command.getNext()) ;

        ExecutionResult executionResult = command.execute(unifiedCommand);
        if (!executionResult.isExecuted()) {
            LOG.error("When executing '{}' encountered error '{}'", unifiedCommand);
            System.out.println(executionResult.getError());
        }

        LOG.info("EXECUTION FINISHED : {}", unifiedCommand);
        return command.isTerminal();
    }
}
