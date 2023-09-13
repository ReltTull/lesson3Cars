package ru.geekbrains.lesson3.carWash;

import ru.geekbrains.lesson3.Car;

public class AutomaticWashingStation extends WashingStation{
    public AutomaticWashingStation(int slots, boolean isSalonWashingTools) {
        super(slots, isSalonWashingTools);
    }


    @Override
    public void wash() {
        System.out.println("Automatic washing. Turn off the engine. Hold doors and windows closed.");
    }

    @Override
    public void washSalon() {
        System.out.println("Salon washing.");
    }
}
