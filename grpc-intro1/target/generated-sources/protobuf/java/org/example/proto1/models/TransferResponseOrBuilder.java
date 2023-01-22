// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: transfer-service.proto

package org.example.proto1.models;

public interface TransferResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:service.TransferResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.service.TransferStatus status = 1;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <code>.service.TransferStatus status = 1;</code>
   * @return The status.
   */
  org.example.proto1.models.TransferStatus getStatus();

  /**
   * <code>repeated .service.Account accounts = 2;</code>
   */
  java.util.List<org.example.proto1.models.Account> 
      getAccountsList();
  /**
   * <code>repeated .service.Account accounts = 2;</code>
   */
  org.example.proto1.models.Account getAccounts(int index);
  /**
   * <code>repeated .service.Account accounts = 2;</code>
   */
  int getAccountsCount();
  /**
   * <code>repeated .service.Account accounts = 2;</code>
   */
  java.util.List<? extends org.example.proto1.models.AccountOrBuilder> 
      getAccountsOrBuilderList();
  /**
   * <code>repeated .service.Account accounts = 2;</code>
   */
  org.example.proto1.models.AccountOrBuilder getAccountsOrBuilder(
      int index);
}