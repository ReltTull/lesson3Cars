package ru.geekbrains.lesson3.carWash;

public interface Washing {
    // по образу и подобию логики заправки, но с разницей, что если в заправке есть разные виды топлива, то в мойке
    // упрощено для одного вида, но вместо того иерархия классов с абстрактным классом мойки
    void wash();
    void washSalon();
}
