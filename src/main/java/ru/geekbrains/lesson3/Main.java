package ru.geekbrains.lesson3;

import ru.geekbrains.lesson3.RefuelingStation;
import ru.geekbrains.lesson3.SportCar;
import ru.geekbrains.lesson3.carWash.AutomaticWashingStation;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        SportCar ferrari = new SportCar("Ferrari", "Enzo", Color.red);
        ferrari.movement();
        ferrari.setRefuelingStation(new RefuelingStation());
        ferrari.fuel();
        ferrari.setWashingStation(new AutomaticWashingStation(5, true));
        ferrari.wash();
    }
}
