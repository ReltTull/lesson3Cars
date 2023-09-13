package ru.geekbrains.lesson3;

import ru.geekbrains.lesson3.carInsides.FuelType;

/**
 * Заправочная станция
 */
interface Refueling{

    /**
     * Заправка
     */
    void fuel(FuelType fuelType);

}
