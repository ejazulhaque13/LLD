package LLD1_6;

public class Client {
    public static void main(String[] args) {
        Car car = new Car();

        car.engine = new HyundaiEngine();
        car.start();
        car.stop();

        car.engine = new MarutiEngine();
        car.start();
        car.stop();
    }

}
