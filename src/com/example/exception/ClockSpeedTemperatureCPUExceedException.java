package com.example.exception;

public class ClockSpeedTemperatureCPUExceedException extends RuntimeException {
    public ClockSpeedTemperatureCPUExceedException(double max) {
        super("Przekroczono maksymalną temperaturę CPU: " + max);
    }
}
