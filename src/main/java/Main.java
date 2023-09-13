import ru.geekbrains.lesson3.RefuelingStation;
import ru.geekbrains.lesson3.SportCar;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        SportCar ferrari = new SportCar("Ferrari", "Enzo", Color.red);
        ferrari.movement();
        ferrari.setRefuelingStation(new RefuelingStation());
        ferrari.fuel();
    }
}
