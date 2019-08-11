package com.example.exception;

public class ClockSpeedTemperatureRAMExceedException extends RuntimeException {
    public ClockSpeedTemperatureRAMExceedException(double max) {
        super("Przekroczono maksymalną temperaturę RAM: " + max);
    }
}
