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

package org.apache.skywalking.oap.log.analyzer.provider.log.listener;

import com.google.protobuf.Message;
import org.apache.skywalking.apm.network.logging.v3.LogData;

/**
 * LogAnalysisListener represents the callback when OAP does the log data analysis.
 */
public interface LogAnalysisListener {
    /**
     * The last step of the analysis process. Typically, the implementations execute corresponding DSL.
     */
    void build();

    /**
     * Parse the raw data from the probe.
     * @return {@code this} for chaining.
     */
    LogAnalysisListener parse(LogData.Builder logData, final Message extraLog);
}
