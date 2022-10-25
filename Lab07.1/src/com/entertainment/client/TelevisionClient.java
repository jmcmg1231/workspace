package com.entertainment.client;

import com.entertainment.DisplayType;
import com.entertainment.Television;

public class TelevisionClient {
    public static void main(String[] args) {
        Television tv = new Television("Sony");

        tv.setVolume(5);
        tv.turnOn();
        tv.turnOff();

        System.out.println(tv.toString());
        System.out.println(" ");
        Television tv2 = new Television("TCL", 11);


        tv2.turnOn();
        tv2.turnOff();

        System.out.println(tv2.toString());

        Television.getNumberOfTimesXyzMethodisInvoked();
        Television.getNumberOfTimesXyzMethodisInvoked();
        Television.getNumberOfTimesXyzMethodisInvoked();
        Television.getNumberOfTimesXyzMethodisInvoked();

        System.out.println(Television.getNumberOfTimesXyzMethodisInvoked());
        System.out.println("");

        Television tv3 = new Television("TCL", 40, DisplayType.LCD);
        tv3.setDisplay(DisplayType.PLASMA);
        System.out.println(tv3.getDisplay());

    }
}
