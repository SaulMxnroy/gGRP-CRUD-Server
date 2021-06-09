// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: UserService.proto

package Main.proto;

public final class UserService {
  private UserService() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_userProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_userProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_userRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_userRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UserRequestId_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UserRequestId_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_OperationalStatusProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_OperationalStatusProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UserUpdate_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UserUpdate_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UserRestProtoColl_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UserRestProtoColl_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UserListLimit_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UserListLimit_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\021UserService.proto\"a\n\tuserProto\022\016\n\006user" +
      "Id\030\001 \001(\005\022\021\n\tfirstName\030\002 \001(\t\022\020\n\010lastName\030" +
      "\003 \001(\t\022\r\n\005email\030\004 \001(\t\022\020\n\010password\030\005 \001(\t\"S" +
      "\n\013userRequest\022\021\n\tfirstName\030\001 \001(\t\022\020\n\010last" +
      "Name\030\002 \001(\t\022\r\n\005email\030\003 \001(\t\022\020\n\010password\030\004 " +
      "\001(\t\"\037\n\rUserRequestId\022\016\n\006userId\030\001 \001(\t\"H\n\026" +
      "OperationalStatusProto\022\027\n\017operationResul" +
      "t\030\001 \001(\t\022\025\n\roperationName\030\002 \001(\t\"?\n\nUserUp" +
      "date\022\016\n\006userId\030\001 \001(\t\022!\n\013userDetails\030\002 \001(" +
      "\0132\014.userRequest\"9\n\021UserRestProtoColl\022$\n\020" +
      "user_rest_protos\030\001 \003(\0132\n.userProto\",\n\rUs" +
      "erListLimit\022\014\n\004page\030\001 \001(\005\022\r\n\005limit\030\002 \001(\005" +
      "2\357\001\n\013CRUDService\022&\n\010readUser\022\016.UserReque" +
      "stId\032\n.userProto\022&\n\ncreateUSer\022\014.userReq" +
      "uest\032\n.userProto\022%\n\nupdateUSer\022\013.UserUpd" +
      "ate\032\n.userProto\0225\n\ndeleteUser\022\016.UserRequ" +
      "estId\032\027.OperationalStatusProto\0222\n\014readLi" +
      "stUser\022\016.UserListLimit\032\022.UserRestProtoCo" +
      "llB\016\n\nMain.protoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_userProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_userProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_userProto_descriptor,
        new String[] { "UserId", "FirstName", "LastName", "Email", "Password", });
    internal_static_userRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_userRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_userRequest_descriptor,
        new String[] { "FirstName", "LastName", "Email", "Password", });
    internal_static_UserRequestId_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_UserRequestId_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UserRequestId_descriptor,
        new String[] { "UserId", });
    internal_static_OperationalStatusProto_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_OperationalStatusProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_OperationalStatusProto_descriptor,
        new String[] { "OperationResult", "OperationName", });
    internal_static_UserUpdate_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_UserUpdate_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UserUpdate_descriptor,
        new String[] { "UserId", "UserDetails", });
    internal_static_UserRestProtoColl_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_UserRestProtoColl_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UserRestProtoColl_descriptor,
        new String[] { "UserRestProtos", });
    internal_static_UserListLimit_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_UserListLimit_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UserListLimit_descriptor,
        new String[] { "Page", "Limit", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
