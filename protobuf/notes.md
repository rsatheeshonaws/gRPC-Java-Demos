# protobuf

- protocol buffers

# versions

    - 1 : google internal
    - 2 : fields can be optional
    - 3 : all fields are mandatory (better to use)

# commands

syntax 
message 
option

# generate

- dependency
- plugin to generate java classes with goal and source directory of proto files
    - target folder
        - generated-sources
- java_multiple_files = true : generates separate class files instead of one java class file

# Equals method

- can we override ? no. instead you can create helper class to mitigate

# Serialization

- file extension : ".ser"
- toByteArray

# DeSerialization

- parseFrom(bytes);

# plugins

- executable is required
- protoc-plugins has executable
- we can download and generate using protoc command as well

# Data types

- repeated
- map
- enum : 
   - first value should be zero
   - default zero
    
# default values
  - default values for custom data types
  - hasAddress/hasCar etc
# Import Modules
   - package and java_package are different
   - package for holding proto files
   - java_package means holding generated java files

# One Of
  - one of alias {}
  - ModeCase : generated enum
  - use case : success response or error response

# Wrappers
  - import google wrapper proto

#IMP : PROTO VS JSON
 - proto is faster because size is small compared with json
 - proto serialization and deserialization uses tags ( 1, 2,3)
 - tags 
    - 1, 100, etc
    - 1-15 : 1 byte - frequently used
    - 16 - 2047 : 2byte
    - 19000-19999 reserved
# Message changes    
   - rename field - yes
   - remove field - yes
   - add new field - yes
   - remove and add new field (replace) - no
        solution : use reserved keyword
        reserved 2;
        reserved "year", "model";
     

# gRPC
  - action oriented not resource oriented
  - client to server
     - sync
     - async
    
  - gRPC types :
    - Unary
       normal request-response
    - Server streaming
       eg : pagination
    - Client streaming
       client sends multiple streaming requests - server sends one response
       eg : file upload
    - Bidirectional streaming
    - commands
       service , rpc , returns
    - server
        - extends ImplBase
        - Clients : stub



 Channel : connection between client and server
   - persistent (default 30 mins)
   - used for multiple concurrent requests
   - idle connections closed by server if new version app deployed, app crashes
   - can share with multiple stubs
   - expensive operation
   - thread safe
   - lazy as well
 Load Balancing : because persistent connection
   - client side
   - server side 
