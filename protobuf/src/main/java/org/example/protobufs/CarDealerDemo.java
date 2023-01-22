package org.example.protobufs;

import org.example.protobufs.models.BodyStyle;
import org.example.protobufs.models.Car;
import org.example.protobufs.models.Dealer;

public class CarDealerDemo {
    public static void main(String[] args) {


        Car honda = Car.newBuilder()
                .setMake("Honda")
                .setBodyStyle(BodyStyle.SUV)
                .build();
        Car toyota = Car.newBuilder()
                .setMake("toyota")
                .setBodyStyle(BodyStyle.COUPE)
                .build();

        Dealer dealer = Dealer.newBuilder()
                .putCarModels(1, honda)
                .putCarModels(2, toyota)
                .build();

        System.out.println(dealer.getCarModelsOrThrow(1));
        System.out.println(dealer.getCarModelsOrThrow(2));
        System.out.println(dealer.getCarModelsOrThrow(3));

    }
}
