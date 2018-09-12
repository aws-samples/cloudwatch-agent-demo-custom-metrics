// Copyright 2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
// SPDX-License-Identifier: MIT-0

package ordering;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Base64;

import static ordering.Application.statsd;

@RestController
public class EncodeController {

    @RequestMapping("/encode")
    public String encode(@RequestParam(value = "text") String text) {
        long startTime = System.currentTimeMillis();

        statsd.incrementCounter("totalRequest.count", new String[]{"path:/encode"});

        statsd.recordSetValue("uniqueRequest.count", text, new String[]{"path:/encode"});

        statsd.recordHistogramValue("request.size", text.length(), new String[]{"path:/encode"});

        String encodedString = Base64.getEncoder().encodeToString(text.getBytes());

        statsd.recordExecutionTime("latency", System.currentTimeMillis() - startTime, new String[]{"path:/encode"});

        return encodedString;
    }
}
