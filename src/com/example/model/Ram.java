package com.example.model;

import com.example.exception.ClockSpeedTemperatureRAMExceedException;

public class Ram extends Component {
    private int memoryAmount;
    private int clockSpeed;
    private double currentTemp;
    private static final double MAX_TEMP = 45;
    private static final double AMOUNT_OF_DEGREE = 15;
    private static final int MAX_CLOCK_SPEED = 2000;

    public int increaseClockSpeed(double amount) {
        if (increaseCurrentTemp(amount) < MAX_TEMP && clockSpeed < MAX_CLOCK_SPEED) {
            return clockSpeed += amount;
        } else {
            throw new ClockSpeedTemperatureRAMExceedException(MAX_TEMP);
        }
    }

    private double increaseCurrentTemp(double amount) {
        return currentTemp += (amount / 100) * AMOUNT_OF_DEGREE;
    }

    public Ram(String name, String producer, String serialNumber, int memoryAmount, int clockSpeed) {
        super(name, producer, serialNumber);
        if (increaseCurrentTemp(MAX_CLOCK_SPEED - clockSpeed) > MAX_TEMP) {
            throw new ClockSpeedTemperatureRAMExceedException(MAX_TEMP);
        }
        this.clockSpeed = clockSpeed;
        this.memoryAmount = memoryAmount;
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

    public double getCurrentTemp() {
        return currentTemp;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", memoryAmount= " + memoryAmount +
                ", clockSpeed= " + clockSpeed +
                ", currentTemp= " + currentTemp;
    }
}