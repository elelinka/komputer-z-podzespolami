package com.example.model;

public class Computer {
    private Cpu cpu;
    private Ram ram;
    private HardDrive hardDrive;

    public Computer() {
    }

    public Computer(Cpu cpu, Ram ram, HardDrive hardDrive) {
        this.cpu = cpu;
        this.ram = ram;
        this.hardDrive = hardDrive;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public HardDrive getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(HardDrive hardDrive) {
        this.hardDrive = hardDrive;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "\nCPU " + cpu +
                "\nRam " + ram +
                "\nHardDrive " + hardDrive +
                '}';
    }
}
