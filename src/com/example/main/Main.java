package com.example.main;

import com.example.exception.ClockSpeedTemperatureCPUExceedException;
import com.example.exception.ClockSpeedTemperatureRAMExceedException;
import com.example.model.Computer;
import com.example.model.Cpu;
import com.example.model.HardDrive;
import com.example.model.Ram;

public class Main {
    public static void main(String[] args) {
        Cpu cpu = new Cpu("Intel Core i7", "Intel", "8565-U", 2500);
        Ram ram = new Ram("Kingston DDR3L CL11", "Kingston", "135V", 16, 1600);
        HardDrive hardDrive = new HardDrive("Dysk SSD SATA3", "Kingston", "UV500", 240);

        try {
            Computer computer = new Computer(cpu, ram, hardDrive);
            computer.getCpu().increaseClockSpeed(500);
            computer.getRam().increaseClockSpeed(300);
            System.out.println(computer);
        } catch (ClockSpeedTemperatureCPUExceedException | ClockSpeedTemperatureRAMExceedException e) {
            System.err.println(e.getMessage());
        }


    }
}
