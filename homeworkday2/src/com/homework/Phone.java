package com.homework;

public class Phone {
    int screensize;
    String brand;
    String cpu;
    int  memory;

    public int getScreensize(int i) {
        return screensize;
    }

    public void setScreensize(int screensize) {
        this.screensize = screensize;
    }

    public String getBrand(String aa) {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCpu(String bb) {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getMemory(int i) {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public Phone(int screensize, String brand, String cpu, int memory) {
        this.screensize = screensize;
        this.brand = brand;
        this.cpu = cpu;
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "screensize=" + screensize +
                ", brand='" + brand + '\'' +
                ", cpu='" + cpu + '\'' +
                ", memory=" + memory +
                '}';
    }
}
