package com.graylog.gclient.interpreter.command;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ActiveProfiles;

@ComponentScan(basePackages = {"com.graylog.gclient"})
@SpringBootTest
@ActiveProfiles("test")
public abstract class GClientTest {
}
