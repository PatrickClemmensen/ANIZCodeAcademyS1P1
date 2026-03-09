package Lesson17.Comparable.Car;

public class Car implements Comparable<Car> {
    private String plate;

    // 2. Constructor
    public Car(String plate) {
        this.plate = plate;
    }

    // 5. Getter
    public String getPlate() {
        return plate;
    }

    // 4. IntelliJ laver compareTo – først med return 0;
    // 12. Tilpas til sortering
    @Override
    public int compareTo(Car o) {
        // stigende orden (A -> Z)
        return this.plate.compareTo(o.plate);

        // Hvis du vil have faldende orden, kan du bytte om:
        // return o.plate.compareTo(this.plate);
    }

    @Override
    public String toString() {
        return plate;
    }
}
