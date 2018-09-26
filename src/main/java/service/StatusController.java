// Copyright 2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
// SPDX-License-Identifier: MIT-0

package service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static service.Application.statsd;

@RestController
public class StatusController {

    @RequestMapping("/status")
    public int status() {
        statsd.recordGaugeValue("memory.free", Runtime.getRuntime().freeMemory(), new String[]{"path:/status"});
        return 0;
    }
}
