package ru.geekbrains.lesson3.carWash;

import ru.geekbrains.lesson3.Car;

import java.util.Queue;

public abstract class WashingStation implements Washing{

    private int slots;
    private boolean isSalonWashingTools;

    public WashingStation(int slots, boolean isSalonWashingTools) {
        this.slots = slots;
        this.isSalonWashingTools = isSalonWashingTools;
    }

    public abstract void wash();
    public abstract void washSalon();

}
