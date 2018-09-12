#!/usr/bin/env bash

# Copyright 2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
# SPDX-License-Identifier: MIT-0

cd "$(dirname "$0")"
./stop.sh
java -jar demo-1.0.0.jar > /dev/null 2>&1 &