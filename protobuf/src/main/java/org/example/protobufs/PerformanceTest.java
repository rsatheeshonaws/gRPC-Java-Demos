package org.example.protobufs;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.protobuf.Int32Value;
import org.example.protobufs.json.JPerson;
import org.example.protobufs.models.Person;

import java.util.stream.IntStream;

public class PerformanceTest {
    public static void main(String[] args) {

        JPerson jPerson = new JPerson();
        jPerson.setAge(15);
        jPerson.setName("raju");
        //runnable1
        Runnable jsonRunnable = () -> {
            try {
                ObjectMapper mapper = new ObjectMapper();
                byte[] value = mapper.writeValueAsBytes(jPerson);
                JPerson jPerson1 = mapper.readValue(value, JPerson.class);
            } catch (Exception e) {

            }
        };
        Person person = Person.newBuilder()
                .setAge(Int32Value.newBuilder().build())
                .setName("satheesh")
                .build();
        Runnable protoRunnable = () -> {
            try {

                byte[] value = person.toByteArray();
                Person jPerson1 = Person.parseFrom(value);
            } catch (Exception e) {

            }
        };

        IntStream.range(1, 6)
                .forEach(integer ->
                {
                    runPerformanceTest(jsonRunnable, "JSON");
                    runPerformanceTest(protoRunnable, "GRPC");
                });

    }

    public static void runPerformanceTest(Runnable runnable, String method) {
        long time1 = System.currentTimeMillis();

        for (int i = 0; i < 1_00_000; i++) {
            runnable.run();
        }

        long time2 = System.currentTimeMillis();

        System.out.println("method : " + method + " : " + (time2 - time1) + " ms ");
    }
}
