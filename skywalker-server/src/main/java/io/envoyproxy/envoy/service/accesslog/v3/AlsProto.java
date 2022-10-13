// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/service/accesslog/v3/als.proto

package io.envoyproxy.envoy.service.accesslog.v3;

public final class AlsProto {
  private AlsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_service_accesslog_v3_StreamAccessLogsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_service_accesslog_v3_StreamAccessLogsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_service_accesslog_v3_StreamAccessLogsMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_service_accesslog_v3_StreamAccessLogsMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_service_accesslog_v3_StreamAccessLogsMessage_Identifier_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_service_accesslog_v3_StreamAccessLogsMessage_Identifier_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_service_accesslog_v3_StreamAccessLogsMessage_HTTPAccessLogEntries_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_service_accesslog_v3_StreamAccessLogsMessage_HTTPAccessLogEntries_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_service_accesslog_v3_StreamAccessLogsMessage_TCPAccessLogEntries_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_service_accesslog_v3_StreamAccessLogsMessage_TCPAccessLogEntries_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$envoy/service/accesslog/v3/als.proto\022\032" +
      "envoy.service.accesslog.v3\032\037envoy/config" +
      "/core/v3/base.proto\032\'envoy/data/accesslo" +
      "g/v3/accesslog.proto\032\035udpa/annotations/s" +
      "tatus.proto\032!udpa/annotations/versioning" +
      ".proto\032\027validate/validate.proto\"V\n\030Strea" +
      "mAccessLogsResponse::\232\305\210\0365\n3envoy.servic" +
      "e.accesslog.v2.StreamAccessLogsResponse\"" +
      "\377\006\n\027StreamAccessLogsMessage\022R\n\nidentifie" +
      "r\030\001 \001(\0132>.envoy.service.accesslog.v3.Str" +
      "eamAccessLogsMessage.Identifier\022]\n\thttp_" +
      "logs\030\002 \001(\0132H.envoy.service.accesslog.v3." +
      "StreamAccessLogsMessage.HTTPAccessLogEnt" +
      "riesH\000\022[\n\010tcp_logs\030\003 \001(\0132G.envoy.service" +
      ".accesslog.v3.StreamAccessLogsMessage.TC" +
      "PAccessLogEntriesH\000\032\241\001\n\nIdentifier\0222\n\004no" +
      "de\030\001 \001(\0132\032.envoy.config.core.v3.NodeB\010\372B" +
      "\005\212\001\002\020\001\022\031\n\010log_name\030\002 \001(\tB\007\372B\004r\002\020\001:D\232\305\210\036?" +
      "\n=envoy.service.accesslog.v2.StreamAcces" +
      "sLogsMessage.Identifier\032\260\001\n\024HTTPAccessLo" +
      "gEntries\022H\n\tlog_entry\030\001 \003(\0132+.envoy.data" +
      ".accesslog.v3.HTTPAccessLogEntryB\010\372B\005\222\001\002" +
      "\010\001:N\232\305\210\036I\nGenvoy.service.accesslog.v2.St" +
      "reamAccessLogsMessage.HTTPAccessLogEntri" +
      "es\032\255\001\n\023TCPAccessLogEntries\022G\n\tlog_entry\030" +
      "\001 \003(\0132*.envoy.data.accesslog.v3.TCPAcces" +
      "sLogEntryB\010\372B\005\222\001\002\010\001:M\232\305\210\036H\nFenvoy.servic" +
      "e.accesslog.v2.StreamAccessLogsMessage.T" +
      "CPAccessLogEntries:9\232\305\210\0364\n2envoy.service" +
      ".accesslog.v2.StreamAccessLogsMessageB\022\n" +
      "\013log_entries\022\003\370B\0012\226\001\n\020AccessLogService\022\201" +
      "\001\n\020StreamAccessLogs\0223.envoy.service.acce" +
      "sslog.v3.StreamAccessLogsMessage\0324.envoy" +
      ".service.accesslog.v3.StreamAccessLogsRe" +
      "sponse\"\000(\001BA\n(io.envoyproxy.envoy.servic" +
      "e.accesslog.v3B\010AlsProtoP\001\210\001\001\272\200\310\321\006\002\020\002b\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.envoyproxy.envoy.config.core.v3.BaseProto.getDescriptor(),
          io.envoyproxy.envoy.data.accesslog.v3.AccesslogProto.getDescriptor(),
          udpa.annotations.Status.getDescriptor(),
          udpa.annotations.Versioning.getDescriptor(),
          io.envoyproxy.pgv.validate.Validate.getDescriptor(),
        });
    internal_static_envoy_service_accesslog_v3_StreamAccessLogsResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_service_accesslog_v3_StreamAccessLogsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_service_accesslog_v3_StreamAccessLogsResponse_descriptor,
        new java.lang.String[] { });
    internal_static_envoy_service_accesslog_v3_StreamAccessLogsMessage_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_envoy_service_accesslog_v3_StreamAccessLogsMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_service_accesslog_v3_StreamAccessLogsMessage_descriptor,
        new java.lang.String[] { "Identifier", "HttpLogs", "TcpLogs", "LogEntries", });
    internal_static_envoy_service_accesslog_v3_StreamAccessLogsMessage_Identifier_descriptor =
      internal_static_envoy_service_accesslog_v3_StreamAccessLogsMessage_descriptor.getNestedTypes().get(0);
    internal_static_envoy_service_accesslog_v3_StreamAccessLogsMessage_Identifier_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_service_accesslog_v3_StreamAccessLogsMessage_Identifier_descriptor,
        new java.lang.String[] { "Node", "LogName", });
    internal_static_envoy_service_accesslog_v3_StreamAccessLogsMessage_HTTPAccessLogEntries_descriptor =
      internal_static_envoy_service_accesslog_v3_StreamAccessLogsMessage_descriptor.getNestedTypes().get(1);
    internal_static_envoy_service_accesslog_v3_StreamAccessLogsMessage_HTTPAccessLogEntries_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_service_accesslog_v3_StreamAccessLogsMessage_HTTPAccessLogEntries_descriptor,
        new java.lang.String[] { "LogEntry", });
    internal_static_envoy_service_accesslog_v3_StreamAccessLogsMessage_TCPAccessLogEntries_descriptor =
      internal_static_envoy_service_accesslog_v3_StreamAccessLogsMessage_descriptor.getNestedTypes().get(2);
    internal_static_envoy_service_accesslog_v3_StreamAccessLogsMessage_TCPAccessLogEntries_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_service_accesslog_v3_StreamAccessLogsMessage_TCPAccessLogEntries_descriptor,
        new java.lang.String[] { "LogEntry", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(udpa.annotations.Status.fileStatus);
    registry.add(udpa.annotations.Versioning.versioning);
    registry.add(io.envoyproxy.pgv.validate.Validate.required);
    registry.add(io.envoyproxy.pgv.validate.Validate.rules);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    io.envoyproxy.envoy.config.core.v3.BaseProto.getDescriptor();
    io.envoyproxy.envoy.data.accesslog.v3.AccesslogProto.getDescriptor();
    udpa.annotations.Status.getDescriptor();
    udpa.annotations.Versioning.getDescriptor();
    io.envoyproxy.pgv.validate.Validate.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}