// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: language-agent/CLRMetric.proto

package org.apache.skywalking.apm.network.language.agent.v3;

public interface ClrGCOrBuilder extends
    // @@protoc_insertion_point(interface_extends:skywalking.v3.ClrGC)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 Gen0CollectCount = 1;</code>
   * @return The gen0CollectCount.
   */
  long getGen0CollectCount();

  /**
   * <code>int64 Gen1CollectCount = 2;</code>
   * @return The gen1CollectCount.
   */
  long getGen1CollectCount();

  /**
   * <code>int64 Gen2CollectCount = 3;</code>
   * @return The gen2CollectCount.
   */
  long getGen2CollectCount();

  /**
   * <code>int64 HeapMemory = 4;</code>
   * @return The heapMemory.
   */
  long getHeapMemory();
}
