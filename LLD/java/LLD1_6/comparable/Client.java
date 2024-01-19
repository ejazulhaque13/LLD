package LLD1_6.comparable;

import java.util.Arrays;

public class Client {
    public static void main(String[] args) {

        Car[] cars = new Car[5];
         cars[0] = new Car(120, 600000, "WagonR");
         cars[1] = new Car(130, 600000, "Swift");
         cars[2] = new Car(150, 1000000, "Seltos");
         cars[3] = new Car(190, 4600000, "Fortuner");

        Arrays.sort(cars);
//        display(cars);
//
//        static void display(Car[] cars){
//            for(Car car: cars){
//                System.out.println(cars);
//            }
//
    }
}
