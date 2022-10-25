package com.entertainment;

import com.entertainment.DisplayType;

public class Television {
    private String brand;
    private int volume;
    DisplayType display = DisplayType.LED;

    private boolean isMuted = false;
    private int oldVolume;

    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;
    private static int numberOfTimesXyzMethodisInvoked = 0;

    public Television() {

    }

    public Television(String brand) {
        this.brand = brand;
    }

    public Television(String brand, int volume) {
        this(brand);
        setVolume(volume);
    }

    public Television(String brand, int volume, DisplayType display) {
        this(brand, volume);
        setDisplay(display);
    }


    public static int getNumberOfTimesXyzMethodisInvoked() {
        return numberOfTimesXyzMethodisInvoked++;
    }


    public void turnOn() {
        //call private method
        boolean isConnected = verifyInternetConnection();
        System.out.println(isConnected);
        System.out.println("Turning on your " + brand + " TV to volume " + volume);

    }

    public boolean isMuted() {
        return isMuted;
    }

    public void performMuteOperation() {
        oldVolume = getVolume();
        setVolume(MIN_VOLUME);
        isMuted = true;
    }

    public void toggleOnOff() {
        if(!isMuted()) {
            performMuteOperation();
        } else {
            setVolume(oldVolume);
            isMuted = false;
        }
    }

    public static DisplayType StringToDisplayType(String str) {
        switch (str) {
            case "LCD":
                return DisplayType.LCD;
            case "OLED":
                return DisplayType.OLED;
            case "CRT":
                return DisplayType.CRT;
            case "PLASMA":
                return DisplayType.PLASMA;
            default:
                return DisplayType.LED;
        }
    }

    public void turnOff() {
        System.out.println("Shutting down..goodbye");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {

        if(brand.equals("Samsung") || brand.equals("LG") || brand.equals("Sony") || brand.equals("Toshiba")) {
            this.brand = brand;
        } else {
            System.out.println("No match found");
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {

        if(volume <  MIN_VOLUME|| volume > MAX_VOLUME ) {
            System.out.println("Invalid volume: " +volume+" Must be within 0 and 100");
        }
        else {
            this.volume = volume;
            isMuted = false;
        }
    }

    public DisplayType getDisplay() {
        return display;
    }

    public void setDisplay(DisplayType display) {
        this.display = display;
    }

    private boolean verifyInternetConnection() {
        return true;
    }

    @Override
    public String toString() {
        return "com.entertainment.Television{" +
                "brand='" + brand + '\'' +
                ", volume=" + volume +
                ", display=" + display +
                ", isMuted=" + isMuted +
                ", oldVolume=" + oldVolume +
                '}';
    }

}
