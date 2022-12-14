/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.skywalking.oap.server.storage.plugin.jdbc.shardingsphere.dao;

import java.io.IOException;
import org.apache.skywalking.oap.server.core.browser.source.BrowserErrorCategory;
import org.apache.skywalking.oap.server.core.query.input.Duration;
import org.apache.skywalking.oap.server.core.query.type.BrowserErrorLogs;
import org.apache.skywalking.oap.server.library.client.jdbc.hikaricp.JDBCHikariCPClient;
import org.apache.skywalking.oap.server.storage.plugin.jdbc.h2.dao.H2BrowserLogQueryDAO;
import org.apache.skywalking.oap.server.storage.plugin.jdbc.shardingsphere.DurationWithinTTL;

public class ShardingBrowserLogQueryDAO extends H2BrowserLogQueryDAO {

    public ShardingBrowserLogQueryDAO(JDBCHikariCPClient h2Client) {
        super(h2Client);
    }

    @Override
    public BrowserErrorLogs queryBrowserErrorLogs(String serviceId,
                                                  String serviceVersionId,
                                                  String pagePathId,
                                                  BrowserErrorCategory category,
                                                  Duration duration,
                                                  int limit,
                                                  int from) throws IOException {
        return super.queryBrowserErrorLogs(
            serviceId,
            serviceVersionId,
            pagePathId,
            category,
            DurationWithinTTL.INSTANCE.getRecordDurationWithinTTL(duration),
            limit,
            from
        );
    }
}
