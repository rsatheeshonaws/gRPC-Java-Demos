package org.example.protobufs;


import com.google.protobuf.Int32Value;
import org.example.protobufs.models.Person;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PersonMain {
    public static void main(String[] args) {
        System.out.println(serializeAndDeserialize());
    }

    public static Person createPerson(String name, int age) {
        return Person.newBuilder()
                .setName("grpc")
                .setAge(Int32Value.newBuilder().setValue(25).build())
                .build();
    }

    public static void overrideNotPossible() {
        Person person = createPerson("satheesh", 15);
        Person person2 = createPerson("satheesh", 15);
        System.out.println(person.equals(person2));
    }

    public static boolean serializeAndDeserialize() {
        try {
            Person person = createPerson("ram", 16);
            Path savedPath = serialize(person);
            Person loaded = deSerialize(savedPath);
            return person.equals(loaded);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static Path serialize(Person person) throws IOException {
        Path path = Paths.get(person.getName().concat(".ser"));
        Files.write(path, person.toByteArray());
        return path.toAbsolutePath();
    }

    public static Person deSerialize(Path path) throws IOException {
        return Person.parseFrom(Files.readAllBytes(path));
    }
}
