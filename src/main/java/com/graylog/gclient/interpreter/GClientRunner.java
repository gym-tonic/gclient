package com.graylog.gclient.interpreter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


import java.util.Scanner;

@Service
@Profile("!test")
public class GClientRunner implements CommandLineRunner {
    private static Logger LOG = LoggerFactory.getLogger(GClientRunner.class);
    private GClientInterpreter gClientInterpreter;

    @Autowired
    public GClientRunner(GClientInterpreter gClientInterpreter) {
        this.gClientInterpreter = gClientInterpreter;
    }

    @Override
    public void run(String... args) {
        LOG.info("gClient starts up...");
        System.out.println("gClient, a Graylog client!");
        Scanner scanner = new Scanner(System.in);
        String nextCommand;
        boolean shouldQuit = false;
        while (!shouldQuit) {
            System.out.print("$ ");
            nextCommand = scanner.nextLine();
            shouldQuit = gClientInterpreter.interpretCommand(nextCommand);
        }
        LOG.info("gClient shuts down...");
        System.out.println("Tschuss!");
        System.exit(0);
    }


}
