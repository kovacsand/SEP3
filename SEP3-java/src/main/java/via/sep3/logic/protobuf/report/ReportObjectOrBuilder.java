// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Report.proto

package via.sep3.logic.protobuf.report;

public interface ReportObjectOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ReportObject)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *if we agree on the format, this should be okay
   * </pre>
   *
   * <code>string date = 1;</code>
   * @return The date.
   */
  java.lang.String getDate();
  /**
   * <pre>
   *if we agree on the format, this should be okay
   * </pre>
   *
   * <code>string date = 1;</code>
   * @return The bytes for date.
   */
  com.google.protobuf.ByteString
      getDateBytes();

  /**
   * <code>string time = 2;</code>
   * @return The time.
   */
  java.lang.String getTime();
  /**
   * <code>string time = 2;</code>
   * @return The bytes for time.
   */
  com.google.protobuf.ByteString
      getTimeBytes();

  /**
   * <code>bytes proof = 3;</code>
   * @return The proof.
   */
  com.google.protobuf.ByteString getProof();

  /**
   * <code>string description = 4;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 4;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>string status = 5;</code>
   * @return The status.
   */
  java.lang.String getStatus();
  /**
   * <code>string status = 5;</code>
   * @return The bytes for status.
   */
  com.google.protobuf.ByteString
      getStatusBytes();

  /**
   * <code>.LocationObject location = 6;</code>
   * @return Whether the location field is set.
   */
  boolean hasLocation();
  /**
   * <code>.LocationObject location = 6;</code>
   * @return The location.
   */
  via.sep3.logic.protobuf.report.LocationObject getLocation();
  /**
   * <code>.LocationObject location = 6;</code>
   */
  via.sep3.logic.protobuf.report.LocationObjectOrBuilder getLocationOrBuilder();
}
