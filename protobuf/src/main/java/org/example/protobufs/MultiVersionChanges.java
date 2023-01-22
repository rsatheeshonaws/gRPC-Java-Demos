//package org.example.protobufs;
//
//import org.example.protobufs.models.Television;
//
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//
//public class MultiVersionChanges {
//    public static void main(String[] args) throws IOException {
//        Path path = serialize(getTelevisionV1(), "t1");
//        Path path2 = serialize(getTelevisionV2(), "t2");
//        deSerialize(path);
//    }
//
//    public static Television getTelevisionV1() {
//        return Television.newBuilder()
//                .setBrand("ONIDA")
////                .setYear(2023)
//                .build();
//    }
//
//    public static Television getTelevisionV2() {
//        return Television.newBuilder()
//                .setBrand("ONIDA")
//                .setYear(2023)
//                .build();
//    }
//
//    public static Path serialize(Television television, String version) throws IOException {
//        Path path = Paths.get(version.concat(".ser"));
//        Files.write(path, television.toByteArray());
//        return path.toAbsolutePath();
//    }
//
//    public static Television deSerialize(Path path) throws IOException {
//        Television television = Television.parseFrom(Files.readAllBytes(path));
//        System.out.println(television);
//        return television;
//    }
//
//}
