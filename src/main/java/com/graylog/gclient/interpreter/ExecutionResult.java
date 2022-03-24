package com.graylog.gclient.interpreter;

public class ExecutionResult {
    private String error;
    private boolean executed;

    public ExecutionResult(String error) {
        this.error = error;
    }

    public ExecutionResult() {
        this.executed = true;
    }

    public String getError() {
        return error;
    }

    public boolean isExecuted() {
        return executed;
    }
}
