#!/usr/bin/env bash

# Copyright 2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
# SPDX-License-Identifier: MIT-0

set -e
mvn clean
mvn package
cp target/demo-*.jar resources/demo-rest-service/
zip -r resources.zip resources