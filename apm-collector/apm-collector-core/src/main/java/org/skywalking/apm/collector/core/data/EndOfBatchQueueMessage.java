/*
 * Copyright 2017, OpenSkywalking Organization All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Project repository: https://github.com/OpenSkywalking/skywalking
 */

package org.skywalking.apm.collector.core.data;

/**
 * 带是否消息批处理的最后一条标记的消息抽象类
 *
 * @author peng-yongsheng
 */
public abstract class EndOfBatchQueueMessage extends AbstractHashMessage {

    /**
     * 是否消息批处理的最后一条的标记
     */
    private boolean endOfBatch;

    public EndOfBatchQueueMessage(String key) {
        super(key);
        endOfBatch = false;
    }

    public final boolean isEndOfBatch() {
        return endOfBatch;
    }

    public final void setEndOfBatch(boolean endOfBatch) {
        this.endOfBatch = endOfBatch;
    }
}
