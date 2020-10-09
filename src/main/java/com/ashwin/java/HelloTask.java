package com.ashwin.java;

import io.dropwizard.servlets.tasks.Task;

import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

public class HelloTask extends Task {
    protected HelloTask() {
        super("hello");
    }

    @Override
    public void execute(Map<String, List<String>> map, PrintWriter printWriter) throws Exception {
        System.out.println("Hello task");
    }
}
