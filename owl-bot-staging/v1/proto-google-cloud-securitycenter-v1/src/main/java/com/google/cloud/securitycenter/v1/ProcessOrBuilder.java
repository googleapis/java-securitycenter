// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/securitycenter/v1/process.proto

package com.google.cloud.securitycenter.v1;

public interface ProcessOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.v1.Process)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * File information for the process executable.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.File binary = 3;</code>
   * @return Whether the binary field is set.
   */
  boolean hasBinary();
  /**
   * <pre>
   * File information for the process executable.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.File binary = 3;</code>
   * @return The binary.
   */
  com.google.cloud.securitycenter.v1.File getBinary();
  /**
   * <pre>
   * File information for the process executable.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.File binary = 3;</code>
   */
  com.google.cloud.securitycenter.v1.FileOrBuilder getBinaryOrBuilder();

  /**
   * <pre>
   * File information for libraries loaded by the process.
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.v1.File libraries = 4;</code>
   */
  java.util.List<com.google.cloud.securitycenter.v1.File> 
      getLibrariesList();
  /**
   * <pre>
   * File information for libraries loaded by the process.
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.v1.File libraries = 4;</code>
   */
  com.google.cloud.securitycenter.v1.File getLibraries(int index);
  /**
   * <pre>
   * File information for libraries loaded by the process.
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.v1.File libraries = 4;</code>
   */
  int getLibrariesCount();
  /**
   * <pre>
   * File information for libraries loaded by the process.
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.v1.File libraries = 4;</code>
   */
  java.util.List<? extends com.google.cloud.securitycenter.v1.FileOrBuilder> 
      getLibrariesOrBuilderList();
  /**
   * <pre>
   * File information for libraries loaded by the process.
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.v1.File libraries = 4;</code>
   */
  com.google.cloud.securitycenter.v1.FileOrBuilder getLibrariesOrBuilder(
      int index);

  /**
   * <pre>
   * When the process represents the invocation of a script,
   * `binary` provides information about the interpreter while `script`
   * provides information about the script file provided to the
   * interpreter.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.File script = 5;</code>
   * @return Whether the script field is set.
   */
  boolean hasScript();
  /**
   * <pre>
   * When the process represents the invocation of a script,
   * `binary` provides information about the interpreter while `script`
   * provides information about the script file provided to the
   * interpreter.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.File script = 5;</code>
   * @return The script.
   */
  com.google.cloud.securitycenter.v1.File getScript();
  /**
   * <pre>
   * When the process represents the invocation of a script,
   * `binary` provides information about the interpreter while `script`
   * provides information about the script file provided to the
   * interpreter.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.File script = 5;</code>
   */
  com.google.cloud.securitycenter.v1.FileOrBuilder getScriptOrBuilder();

  /**
   * <pre>
   * Process arguments as JSON encoded strings.
   * </pre>
   *
   * <code>repeated string args = 6;</code>
   * @return A list containing the args.
   */
  java.util.List<java.lang.String>
      getArgsList();
  /**
   * <pre>
   * Process arguments as JSON encoded strings.
   * </pre>
   *
   * <code>repeated string args = 6;</code>
   * @return The count of args.
   */
  int getArgsCount();
  /**
   * <pre>
   * Process arguments as JSON encoded strings.
   * </pre>
   *
   * <code>repeated string args = 6;</code>
   * @param index The index of the element to return.
   * @return The args at the given index.
   */
  java.lang.String getArgs(int index);
  /**
   * <pre>
   * Process arguments as JSON encoded strings.
   * </pre>
   *
   * <code>repeated string args = 6;</code>
   * @param index The index of the value to return.
   * @return The bytes of the args at the given index.
   */
  com.google.protobuf.ByteString
      getArgsBytes(int index);

  /**
   * <pre>
   * True if `args` is incomplete.
   * </pre>
   *
   * <code>bool arguments_truncated = 7;</code>
   * @return The argumentsTruncated.
   */
  boolean getArgumentsTruncated();

  /**
   * <pre>
   * Process environment variables.
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.v1.EnvironmentVariable env_variables = 8;</code>
   */
  java.util.List<com.google.cloud.securitycenter.v1.EnvironmentVariable> 
      getEnvVariablesList();
  /**
   * <pre>
   * Process environment variables.
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.v1.EnvironmentVariable env_variables = 8;</code>
   */
  com.google.cloud.securitycenter.v1.EnvironmentVariable getEnvVariables(int index);
  /**
   * <pre>
   * Process environment variables.
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.v1.EnvironmentVariable env_variables = 8;</code>
   */
  int getEnvVariablesCount();
  /**
   * <pre>
   * Process environment variables.
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.v1.EnvironmentVariable env_variables = 8;</code>
   */
  java.util.List<? extends com.google.cloud.securitycenter.v1.EnvironmentVariableOrBuilder> 
      getEnvVariablesOrBuilderList();
  /**
   * <pre>
   * Process environment variables.
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.v1.EnvironmentVariable env_variables = 8;</code>
   */
  com.google.cloud.securitycenter.v1.EnvironmentVariableOrBuilder getEnvVariablesOrBuilder(
      int index);

  /**
   * <pre>
   * True if `env_variables` is incomplete.
   * </pre>
   *
   * <code>bool env_variables_truncated = 9;</code>
   * @return The envVariablesTruncated.
   */
  boolean getEnvVariablesTruncated();

  /**
   * <pre>
   * The process id.
   * </pre>
   *
   * <code>int64 pid = 10;</code>
   * @return The pid.
   */
  long getPid();

  /**
   * <pre>
   * The parent process id.
   * </pre>
   *
   * <code>int64 parent_pid = 11;</code>
   * @return The parentPid.
   */
  long getParentPid();
}
