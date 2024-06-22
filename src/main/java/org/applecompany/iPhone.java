package org.applecompany;

public class iPhone {

    private int batteryLevel;
    private boolean isLocked;
    private String screenSize;


    public iPhone(int batteryLevel, boolean isLocked, String screenSize) {
        this.batteryLevel = batteryLevel;
        this.isLocked = isLocked;
        this.screenSize = screenSize;
    }


    public void powerOn() {
        System.out.println("iPhone powered on.");
    }

    public void powerOff() {
        System.out.println("iPhone powered off.");
    }

    public void unlock() {
        System.out.println("iPhone unlocked.");
    }

    public void lock() {
        System.out.println("iPhone locked.");
    }

    // Getters and setters
    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }
}

