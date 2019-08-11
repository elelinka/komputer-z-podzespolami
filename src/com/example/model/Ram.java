package com.example.model;

import com.example.exception.ClockSpeedTemperatureRAMExceedException;

public class Ram extends Component {
    private int memoryAmount;
    private int clockSpeed;
    private double currentTemp;
    private static final double MAX_TEMP = 45;

    public int increaseClockSpeed(double amount) {
        if (increaseCurrentTemp(amount) > MAX_TEMP) {
            throw new ClockSpeedTemperatureRAMExceedException(MAX_TEMP);
        } else {
            return clockSpeed += amount;
        }
    }

    private double increaseCurrentTemp(double amount) {
        return currentTemp += (amount / 100) * 15;
    }

    public Ram() {
    }

    public Ram(String name, String producer, String serialNumber, int memoryAmount, int clockSpeed) {
        super(name, producer, serialNumber);
        this.memoryAmount = memoryAmount;
        this.clockSpeed = clockSpeed;
    }

    public int getMemoryAmount() {
        return memoryAmount;
    }

    public void setMemoryAmount(int memoryAmount) {
        this.memoryAmount = memoryAmount;
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
                ", memoryAmount= " + memoryAmount +
                ", clockSpeed= " + clockSpeed +
                ", currentTemp= " + currentTemp;
    }
}
