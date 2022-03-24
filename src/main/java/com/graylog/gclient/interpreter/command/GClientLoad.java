package com.graylog.gclient.interpreter.command;

import com.graylog.gclient.interpreter.ExecutionResult;
import com.graylog.gclient.parser.GraylogInputParser;
import com.graylog.gclient.parser.dto.LogDto;
import com.graylog.gclient.sender.GelfSender;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.List;

@Service
@Qualifier("GClientLoad")
public class GClientLoad implements GClientCommand {
    private static Logger LOG = LoggerFactory.getLogger(GClientLoad.class);
    private static final String COMMAND_PREFIX = "load ";
    private GraylogInputParser graylogInputParser;
    private GelfSender gelfSender;
    private GClientCommand nextCommand;

    @Autowired
    public GClientLoad(GraylogInputParser graylogInputParse, GelfSender gelfSender, @Qualifier("GClientUnknown") GClientCommand nextCommand) {
        this.graylogInputParser = graylogInputParse;
        this.gelfSender = gelfSender;
        this.nextCommand = nextCommand;
    }

    @Override
    public boolean matches(String commandInStringFormat) {
        return commandInStringFormat.startsWith(COMMAND_PREFIX);
    }

    @Override
    public ExecutionResult execute(String commandInStringFormat) {
        LOG.info(String.format("was executed for '%s'", commandInStringFormat));
        String[] command = commandInStringFormat.split(" ");
        if (command.length == 2) {
            String pathToFile = command[1];
            LOG.info("Path to file was '{}'", pathToFile);
            File file = new File(pathToFile);
            if (!file.isDirectory() && file.exists()) {
                List<LogDto> lines = graylogInputParser.readFileFromPath(pathToFile);
                gelfSender.sendLines(lines);
                return new ExecutionResult();
            }
            LOG.error("Wrong file path '{}'", pathToFile);
            return new ExecutionResult(String.format("Wrong file path '%s'", pathToFile));
        }
        LOG.error("Command '{}' has wrong number of arguments", commandInStringFormat);
        return new ExecutionResult(String.format("Command '%s' has wrong number of arguments", commandInStringFormat));
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
