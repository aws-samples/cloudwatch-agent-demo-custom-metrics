#!/usr/bin/env bash

# Copyright 2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
# SPDX-License-Identifier: MIT-0

cd "$(dirname "$0")"

sudo yum install collectd collectd-curl -y
sudo cp collectd.conf /etc/

sudo mkdir /etc/collectd
sudo chown `whoami` /etc/collectd
echo "user: secret" > /etc/collectd/auth_file

sudo service collectd restart