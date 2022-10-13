// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: opencensus/proto/metrics/v1/metrics.proto

package io.opencensus.proto.metrics.v1;

public interface PointOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opencensus.proto.metrics.v1.Point)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The moment when this point was recorded. Inclusive.
   * If not specified, the timestamp will be decided by the backend.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp = 1;</code>
   * @return Whether the timestamp field is set.
   */
  boolean hasTimestamp();
  /**
   * <pre>
   * The moment when this point was recorded. Inclusive.
   * If not specified, the timestamp will be decided by the backend.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp = 1;</code>
   * @return The timestamp.
   */
  com.google.protobuf.Timestamp getTimestamp();
  /**
   * <pre>
   * The moment when this point was recorded. Inclusive.
   * If not specified, the timestamp will be decided by the backend.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getTimestampOrBuilder();

  /**
   * <pre>
   * A 64-bit integer.
   * </pre>
   *
   * <code>int64 int64_value = 2;</code>
   * @return Whether the int64Value field is set.
   */
  boolean hasInt64Value();
  /**
   * <pre>
   * A 64-bit integer.
   * </pre>
   *
   * <code>int64 int64_value = 2;</code>
   * @return The int64Value.
   */
  long getInt64Value();

  /**
   * <pre>
   * A 64-bit double-precision floating-point number.
   * </pre>
   *
   * <code>double double_value = 3;</code>
   * @return Whether the doubleValue field is set.
   */
  boolean hasDoubleValue();
  /**
   * <pre>
   * A 64-bit double-precision floating-point number.
   * </pre>
   *
   * <code>double double_value = 3;</code>
   * @return The doubleValue.
   */
  double getDoubleValue();

  /**
   * <pre>
   * A distribution value.
   * </pre>
   *
   * <code>.opencensus.proto.metrics.v1.DistributionValue distribution_value = 4;</code>
   * @return Whether the distributionValue field is set.
   */
  boolean hasDistributionValue();
  /**
   * <pre>
   * A distribution value.
   * </pre>
   *
   * <code>.opencensus.proto.metrics.v1.DistributionValue distribution_value = 4;</code>
   * @return The distributionValue.
   */
  io.opencensus.proto.metrics.v1.DistributionValue getDistributionValue();
  /**
   * <pre>
   * A distribution value.
   * </pre>
   *
   * <code>.opencensus.proto.metrics.v1.DistributionValue distribution_value = 4;</code>
   */
  io.opencensus.proto.metrics.v1.DistributionValueOrBuilder getDistributionValueOrBuilder();

  /**
   * <pre>
   * A summary value. This is not recommended, since it cannot be aggregated.
   * </pre>
   *
   * <code>.opencensus.proto.metrics.v1.SummaryValue summary_value = 5;</code>
   * @return Whether the summaryValue field is set.
   */
  boolean hasSummaryValue();
  /**
   * <pre>
   * A summary value. This is not recommended, since it cannot be aggregated.
   * </pre>
   *
   * <code>.opencensus.proto.metrics.v1.SummaryValue summary_value = 5;</code>
   * @return The summaryValue.
   */
  io.opencensus.proto.metrics.v1.SummaryValue getSummaryValue();
  /**
   * <pre>
   * A summary value. This is not recommended, since it cannot be aggregated.
   * </pre>
   *
   * <code>.opencensus.proto.metrics.v1.SummaryValue summary_value = 5;</code>
   */
  io.opencensus.proto.metrics.v1.SummaryValueOrBuilder getSummaryValueOrBuilder();

  public io.opencensus.proto.metrics.v1.Point.ValueCase getValueCase();
}
