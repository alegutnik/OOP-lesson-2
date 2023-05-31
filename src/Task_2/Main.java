package Task_2;

public class Main {
    public static void main(String[] args) {
        Car car_1 = new Car();
        Car car_2 = new Car("Білий");
        Car car_3 = new Car(2020);
        Car car_4 = new Car(2005, "Червона");

        System.out.println(car_1);
        System.out.println(car_2);
        System.out.println(car_3);
        System.out.println(car_4);

    }
}
