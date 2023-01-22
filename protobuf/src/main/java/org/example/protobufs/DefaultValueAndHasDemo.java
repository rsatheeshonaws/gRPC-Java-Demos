package org.example.protobufs;

import org.example.protobufs.models.Person;

public class DefaultValueAndHasDemo {
    public static void main(String[] args) {

        Person person = Person.newBuilder().build();

        System.out.println("City : " + person.getAddress().getCountry());
        System.out.println("City : " + person.hasAddress());

    }
}
