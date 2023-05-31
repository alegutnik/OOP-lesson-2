package Task_3;

public class Main {
    public static void main(String[] args) {
        Car car_1 = new Car(2000);
        Car car_2 = new Car(2005, 120);
        Car car_3 = new Car(2007, 100, 600);
        Car car_4 = new Car(2010, 100, 800, "Білий");

        System.out.println(car_1);
        System.out.println(car_2);
        System.out.println(car_3);
        System.out.println(car_4);

    }

}
