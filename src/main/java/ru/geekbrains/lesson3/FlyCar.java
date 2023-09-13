package ru.geekbrains.lesson3;

import ru.geekbrains.lesson3.carInsides.FuelType;

import java.awt.*;

public class FlyCar extends Car implements Fueling, Wiping {

    /**
     * уровень топлива в ам
     */
    private int fuelLevel;
    public FlyCar(String make, String model, Color color) {
        super(make, model, color);
        setWheelsCount(4);
        this.fuelLevel = 100;
    }

    /**
     * расход топлива перемещён в более низкоуровневый fly()
     */
    public void fly(){
        fuelLevel--;
        System.out.println("Автомобиль летит!");
    }

    @Override
    public void movement() {
        fly();

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



    @Override
    public void wipMirrors() {

    }

    @Override
    public void wipWindshield() {

    }

    @Override
    public void wipHeadlights() {

    }
    private Refueling refueling;
    public void setRefuelingStation(Refueling refuelingStation) {
        this.refueling = refuelingStation;
    }
    @Override
    public void fuel() {
        if (refueling != null && fuelLevel < 100){
            refueling.fuel(fuelType);
            fuelLevel = 100;
        }
    }
}
