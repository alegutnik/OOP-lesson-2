package Task_4;

public class Car {
    private int year;
    private double speed;
    private int weight;
    private String color;

    public Car(int year, double speed, int weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }

    public Car() {
        this(2009, 107.99, 600, "Чорний");
    }

    public Car(int year) {
        this(year, 100, 800, "Білий");
    }

    public Car(double speed) {
        this(2007, speed, 800, "Білий");
    }

    public Car(int year, double speed) {
        this(year, speed, 800, "Білий");
    }

    public Car(int year, double speed, String color) {
        this(year, speed, 800, color);
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", speed=" + speed +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }
}
