package com.graylog.gclient.utils;

public class Utils {

    public static String unifyCommand(String[] args) {
        String unifiedCommand = "";
        for (int i = 0; i < args.length; ++i) {
            unifiedCommand += args[i];
        }
        return unifiedCommand;
    }
}
