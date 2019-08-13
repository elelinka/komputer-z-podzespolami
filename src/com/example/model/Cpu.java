package com.example.model;

import com.example.exception.ClockSpeedTemperatureCPUExceedException;

public class Cpu extends Component {
    private int clockSpeed;
    private double currentTemp;
    private static final double MAX_TEMP = 75;
    private static final double AMOUNT_OF_DEGREE = 10;
    private static final int MIN_CLOCK_SPEED = 2800;

    public int increaseClockSpeed(double amount) {
        if (increaseCurrentTemp(amount) < MAX_TEMP && clockSpeed < MIN_CLOCK_SPEED) {
            return clockSpeed += amount;
        } else {
            throw new ClockSpeedTemperatureCPUExceedException(MAX_TEMP);
        }
    }

    private double increaseCurrentTemp(double amount) {
        return currentTemp += (amount / 100) * AMOUNT_OF_DEGREE;
    }

    public Cpu(String name, String producer, String serialNumber, int clockSpeed) {
        super(name, producer, serialNumber);
        if (increaseCurrentTemp(MIN_CLOCK_SPEED - clockSpeed) > MAX_TEMP) {
            throw new ClockSpeedTemperatureCPUExceedException(MAX_TEMP);
        }
        this.clockSpeed = clockSpeed;
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
                ", clockSpeed= " + clockSpeed +
                ", currentTemp= " + currentTemp;
    }
}