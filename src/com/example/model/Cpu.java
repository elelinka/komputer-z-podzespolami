package com.example.model;

import com.example.exception.ClockSpeedTemperatureCPUExceedException;

public class Cpu extends Component {
    private int clockSpeed;
    private double currentTemp;
    private static final double MAX_TEMP = 75;

    public int increaseClockSpeed(double amount) {
        if (increaseCurrentTemp(amount) > MAX_TEMP) {
            throw new ClockSpeedTemperatureCPUExceedException(MAX_TEMP);
        } else {
            return clockSpeed += amount;
        }
    }

    private double increaseCurrentTemp(double amount) {
        return currentTemp += (amount / 100) * 10;
    }

    public Cpu() {
    }

    public Cpu(String name, String producer, String serialNumber, int clockSpeed) {
        super(name, producer, serialNumber);
        this.clockSpeed = clockSpeed;
        //this.currentTemp = currentTemp;
    }

    public int getClockSpeed() {
        return clockSpeed;
    }

    public void setClockSpeed(int clockSpeed) {
        this.clockSpeed = clockSpeed;
    }

    public double getCurrentTemp() {
        return currentTemp;
    }

    public void setCurrentTemp(double currentTemp) {
        this.currentTemp = currentTemp;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", clockSpeed= " + clockSpeed +
                ", currentTemp= " + currentTemp;
    }
}
