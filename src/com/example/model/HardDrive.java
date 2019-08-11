package com.example.model;

public class HardDrive extends Component {
    private int volume;

    public HardDrive() {
    }

    public HardDrive(String name, String producer, String serialNumber, int volume) {
        super(name, producer, serialNumber);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", volume= " + volume;
    }
}
