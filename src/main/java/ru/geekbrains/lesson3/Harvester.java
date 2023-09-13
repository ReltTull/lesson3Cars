package ru.geekbrains.lesson3;

import ru.geekbrains.lesson3.carInsides.FuelType;

import java.awt.*;

public class Harvester extends Car implements Fueling, Wiping {

    /**
     * уровень топлива в ам
     */
    private int fuelLevel;
    private Refueling refueling;

    public Harvester(String make, String model, Color color) {
        super(make, model, color);
        setWheelsCount(6);
        fuelType = FuelType.Diesel;
    }

    public void setRefuelingStation(Refueling refuelingStation) {
        this.refueling = refuelingStation;
    }

    /**
     * Добавлено повышение уровня топлива до 100
     */
    @Override
    public void fuel() {
        if (refueling != null && fuelLevel < 100){
            refueling.fuel(fuelType);
            fuelLevel = 100;
        }
    }

    /**
     * добавлен расход топлива
     */
    @Override
    public void movement() {
        fuelLevel--;
    }

    @Override
    public void maintenance() {

    }

    @Override
    public boolean gearShifting() {
        return false;
    }

    @Override
    public boolean switchHeadlights() {
        return false;
    }

    @Override
    public boolean switchWipers() {
        return false;
    }

    public void sweeping() {
        System.out.println("Автомобиль метет улицу.");
    }



    @Override
    public void wipMirrors() {

    }

    @Override
    public void wipWindshield() {

    }

    @Override
    public void wipHeadlights() {

    }


}
