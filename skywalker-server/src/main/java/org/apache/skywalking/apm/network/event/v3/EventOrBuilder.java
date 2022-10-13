// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: event/Event.proto

package org.apache.skywalking.apm.network.event.v3;

public interface EventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:skywalking.v3.Event)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Unique ID of the event. Because an event may span a long period of time, the UUID is necessary to associate the
   * start time with the end time of the same event.
   * </pre>
   *
   * <code>string uuid = 1;</code>
   * @return The uuid.
   */
  java.lang.String getUuid();
  /**
   * <pre>
   * Unique ID of the event. Because an event may span a long period of time, the UUID is necessary to associate the
   * start time with the end time of the same event.
   * </pre>
   *
   * <code>string uuid = 1;</code>
   * @return The bytes for uuid.
   */
  com.google.protobuf.ByteString
      getUuidBytes();

  /**
   * <pre>
   * The source object that the event occurs on.
   * </pre>
   *
   * <code>.skywalking.v3.Source source = 2;</code>
   * @return Whether the source field is set.
   */
  boolean hasSource();
  /**
   * <pre>
   * The source object that the event occurs on.
   * </pre>
   *
   * <code>.skywalking.v3.Source source = 2;</code>
   * @return The source.
   */
  org.apache.skywalking.apm.network.event.v3.Source getSource();
  /**
   * <pre>
   * The source object that the event occurs on.
   * </pre>
   *
   * <code>.skywalking.v3.Source source = 2;</code>
   */
  org.apache.skywalking.apm.network.event.v3.SourceOrBuilder getSourceOrBuilder();

  /**
   * <pre>
   * The name of the event. For example, `Reboot`, `Upgrade` etc.
   * </pre>
   *
   * <code>string name = 3;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the event. For example, `Reboot`, `Upgrade` etc.
   * </pre>
   *
   * <code>string name = 3;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The type of the event. This field is friendly for UI visualization, where events of type `Normal` are considered as normal operations,
   * while `Error` is considered as unexpected operations, such as `Crash` events, therefore we can mark them with different colors to be easier identified.
   * </pre>
   *
   * <code>.skywalking.v3.Type type = 4;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * The type of the event. This field is friendly for UI visualization, where events of type `Normal` are considered as normal operations,
   * while `Error` is considered as unexpected operations, such as `Crash` events, therefore we can mark them with different colors to be easier identified.
   * </pre>
   *
   * <code>.skywalking.v3.Type type = 4;</code>
   * @return The type.
   */
  org.apache.skywalking.apm.network.event.v3.Type getType();

  /**
   * <pre>
   * The detail of the event that describes why this event happened. This should be a one-line message that briefly describes why the event is reported.
   * Examples of an `Upgrade` event may be something like `Upgrade from ${from_version} to ${to_version}`.
   * It's NOT encouraged to include the detailed logs of this event, such as the exception stack trace.
   * </pre>
   *
   * <code>string message = 5;</code>
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   * <pre>
   * The detail of the event that describes why this event happened. This should be a one-line message that briefly describes why the event is reported.
   * Examples of an `Upgrade` event may be something like `Upgrade from ${from_version} to ${to_version}`.
   * It's NOT encouraged to include the detailed logs of this event, such as the exception stack trace.
   * </pre>
   *
   * <code>string message = 5;</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <pre>
   * The parameters in the `message` field.
   * </pre>
   *
   * <code>map&lt;string, string&gt; parameters = 6;</code>
   */
  int getParametersCount();
  /**
   * <pre>
   * The parameters in the `message` field.
   * </pre>
   *
   * <code>map&lt;string, string&gt; parameters = 6;</code>
   */
  boolean containsParameters(
      java.lang.String key);
  /**
   * Use {@link #getParametersMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getParameters();
  /**
   * <pre>
   * The parameters in the `message` field.
   * </pre>
   *
   * <code>map&lt;string, string&gt; parameters = 6;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getParametersMap();
  /**
   * <pre>
   * The parameters in the `message` field.
   * </pre>
   *
   * <code>map&lt;string, string&gt; parameters = 6;</code>
   */

  java.lang.String getParametersOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <pre>
   * The parameters in the `message` field.
   * </pre>
   *
   * <code>map&lt;string, string&gt; parameters = 6;</code>
   */

  java.lang.String getParametersOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * The start time (in milliseconds) of the event, measured between the current time and midnight, January 1, 1970 UTC.
   * This field is mandatory when an event occurs.
   * </pre>
   *
   * <code>int64 startTime = 7;</code>
   * @return The startTime.
   */
  long getStartTime();

  /**
   * <pre>
   * The end time (in milliseconds) of the event. , measured between the current time and midnight, January 1, 1970 UTC.
   * This field may be empty if the event has not stopped yet, otherwise it should be a valid timestamp after `startTime`.
   * </pre>
   *
   * <code>int64 endTime = 8;</code>
   * @return The endTime.
   */
  long getEndTime();

  /**
   * <pre>
   * [Required] Since 9.0.0
   * Name of the layer to which the event belongs.
   * </pre>
   *
   * <code>string layer = 9;</code>
   * @return The layer.
   */
  java.lang.String getLayer();
  /**
   * <pre>
   * [Required] Since 9.0.0
   * Name of the layer to which the event belongs.
   * </pre>
   *
   * <code>string layer = 9;</code>
   * @return The bytes for layer.
   */
  com.google.protobuf.ByteString
      getLayerBytes();
}