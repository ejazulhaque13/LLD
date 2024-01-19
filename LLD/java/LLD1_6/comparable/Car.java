package LLD1_6.comparable;

public class Car implements Comparable<Car>{
    int speed;
    int price;
    String name;

    public Car(int speed, int price, String name) {
        this.speed = speed;
        this.price = price;
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "[Name=" + this.name + ", Speed=" + this.speed + ", Price=" + this.price + "]";
    }


    @Override
    public int compareTo(Car o) {
        return this.speed - o.speed;
    }
}
