package com.ashwin.java;

import com.ashwin.java.api.resource.HelloResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class TaskDemoApplication extends Application<TaskDemoConfiguration> {
    public static void main(String[] args) throws Exception {
        new TaskDemoApplication().run(args);
    }

    @Override
    public void run(TaskDemoConfiguration config, Environment env) throws Exception {
        // Tasks
        env.admin().addTask(new HelloTask());

        // Resources
        env.jersey().register(new HelloResource());
    }
}
