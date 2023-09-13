package ru.geekbrains.lesson3.carWash;

public class ManualWashingStation extends WashingStation{
    public ManualWashingStation(int slots, boolean isSalonWashingTools) {
        super(slots, isSalonWashingTools);
    }

    @Override
    public void wash() {
        System.out.println("Here tools to wash your car.");
    }

    @Override
    public void washSalon() {
        System.out.println("Here tools to wash your car's salon.");
    }
}
