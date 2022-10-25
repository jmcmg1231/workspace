/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

class Television {

    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;
    private static int instanceCount = 0;

    private String brand;
    static int volume;


    public Television() {
        instanceCount++; // instanceCount = instanceCount + 1;
    }

    public Television(String brand) {
        this();
        setBrand(brand);
    }

    public static int getInstanceCount() {
        return instanceCount;
    }

    public Television(String brand, int volume) {
        this(brand);
        setVolume(volume);
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String toString() {
        return "Television: brand=" + getBrand() + ", volume=" + getVolume();
    }
}