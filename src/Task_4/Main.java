package Task_4;

public class Main {
    public static void main(String[] args) {
        Car car_1 = new Car(2000);
        Car car_2 = new Car(107.15);
        Car car_3 = new Car(1997, 107.15);
        Car car_4 = new Car(2009, 207.15, "Чорний");
        Car car_5 = new Car(2005, 180, 900, "Зелений");
        Car car_6 = new Car();

        System.out.println(car_1);
        System.out.println(car_2);
        System.out.println(car_3);
        System.out.println(car_4);
        System.out.println(car_5);
        System.out.println(car_6);


    }
}
