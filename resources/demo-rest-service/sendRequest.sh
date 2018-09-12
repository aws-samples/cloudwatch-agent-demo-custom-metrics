#!/usr/bin/env bash

# Copyright 2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
# SPDX-License-Identifier: MIT-0

set -e
echo "send 100 requests"
for i in {1..100}
do
   curl "localhost:8080/encode?text=TextToEncode_${i}_@#%"
   echo ""
   sleep 1
done