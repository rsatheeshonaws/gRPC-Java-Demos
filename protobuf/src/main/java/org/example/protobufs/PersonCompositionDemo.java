package org.example.protobufs;

import com.google.protobuf.Int32Value;
import org.example.protobufs.models.Address;
import org.example.protobufs.models.Car;
import org.example.protobufs.models.Person;

public class PersonCompositionDemo {
    public static void main(String[] args) {

        Address address = Address.newBuilder()
                .setCountry("india")
                .setStreet("steet1")
                .build();

        Car honda = Car.newBuilder()
                .setMake("Honda")
                .build();
        Car toyota = Car.newBuilder()
                .setMake("toyota")
                .build();

        Person person = Person.newBuilder()
                .setAge(Int32Value.newBuilder().setValue(45).build())
                .setName("satheesh")
                .setAddress(address)
                .addCar(toyota)
                .addCar(honda)
                .build();

        System.out.println(person);
    }
}
