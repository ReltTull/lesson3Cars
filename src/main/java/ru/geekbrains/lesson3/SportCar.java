package ru.geekbrains.lesson3;

import ru.geekbrains.lesson3.carInsides.FuelType;
import ru.geekbrains.lesson3.carWash.Washing;

import java.awt.*;

public class SportCar extends Car implements Fueling, Wiping, Washing {

    /**
     * уровень топлива в ам
     */
    private int fuelLevel;

    public int getFuelLevel() {
        return fuelLevel;
    }

    /**
     * показатель чистоты, требуется ли мойка
     */
    private boolean isClean;

    public SportCar(String make, String model, Color color) {
        super(make, model, color);
        setWheelsCount(3);
        this.fuelLevel = 100;
        fuelType = FuelType.Gasoline;
        isClean = true;
    }

    /**
     * Добавил упрощенный расход топлива при движении.
     * + при движении машина становится грязной, меняя isClean
     */
    @Override
    public void movement() {
        fuelLevel--;
        System.out.println("Car moved. Fuel level is: " + fuelLevel);
        isClean = false;
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

    private Refueling refueling;
    public void setRefuelingStation(Refueling refuelingStation) {
        this.refueling = refuelingStation;
    }
    /**
     * Добавил физику заправки. Показатель уровеня заправленного авто - 100. Соответственная проверка на уровень топлива в ам
     */
    @Override
    public void fuel() {
        if (refueling != null && fuelLevel < 100){
            refueling.fuel(fuelType);
            fuelLevel = 100;
            System.out.println("Fueling is completed.");
        } else {
            System.out.println("Fueling is not completed.");
        }
    }

    private Washing washing;
    public void setWashingStation(Washing washingStation) {
        this.washing = washingStation;
    }
    @Override
    public void wash() {
        washing.wash();
    }

    @Override
    public void washSalon() {

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
