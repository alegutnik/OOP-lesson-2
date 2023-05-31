package Task_2;

public class Car {
    private int year;
    private String color;

    public Car(int year, String color) {
        this.year = year;
        this.color = color;
    }

    public Car(int year) {
        this.color = "Чорна"; // Якщо потрібне дефолтне значення розкоментуй. Без цієї строки значення color буде null
        this.year = year;
    }

    public Car(String color) {
        this.color = color;
//        this.year = 2000; // Якщо потрібне дефолтне значення розкоментуй. Без цієї строки значення year буде 0
    }

    public Car() {

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", color='" + color + '\'' +
                '}';
    }
}
