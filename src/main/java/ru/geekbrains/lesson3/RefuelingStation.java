package ru.geekbrains.lesson3;

import ru.geekbrains.lesson3.carInsides.FuelType;

public class RefuelingStation implements Refueling {
    @Override
    public void fuel(FuelType fuelType) {
        switch (fuelType){
            case Diesel -> System.out.println("Fueling by diesel.");
            case Gasoline -> System.out.println("Fueling by petrol.");
        }
    }
}
