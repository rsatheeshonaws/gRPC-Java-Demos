package org.example.protobufs;

import org.example.protobufs.models.Credentials;
import org.example.protobufs.models.EmailCredentials;
import org.example.protobufs.models.PhoneOTP;

public class OneOfDemo {
    public static void main(String[] args) {

        EmailCredentials emailCredentials = EmailCredentials.newBuilder()
                .setPassword("12345")
                .setUsername("raju")
                .build();

        PhoneOTP phoneOTP = PhoneOTP.newBuilder()
                .setCode("12345")
                .setNumber("9704561177")
                .build();

        Credentials credentials = Credentials.newBuilder()
                .setEmailMode(emailCredentials)
                .setPhoneMode(phoneOTP)
                .build();

        login(credentials);
    }

    public static void login(Credentials credentials) {
        switch (credentials.getModeCase()) {
            case EMAILMODE:
                System.out.println("Email : " + credentials);
                break;
            case PHONEMODE:
                System.out.println("Phone : " + credentials);
        }
    }
}
