// Copyright 2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
// SPDX-License-Identifier: MIT-0

package service;

import com.timgroup.statsd.NonBlockingStatsDClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    static final com.timgroup.statsd.StatsDClient statsd = new NonBlockingStatsDClient("", "localhost", 8125,
        new String[]{"app:demo-custom-metrics"});

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
