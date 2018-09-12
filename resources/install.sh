#!/usr/bin/env bash

# Copyright 2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
# SPDX-License-Identifier: MIT-0

set -e
cd "$(dirname "$0")"
./demo-rest-service/update-jdk.sh
./demo-rest-service/start.sh
./collectd/install.sh
./amazon-cloudwatch-agent/install.sh
./demo-rest-service/sendRequest.sh
