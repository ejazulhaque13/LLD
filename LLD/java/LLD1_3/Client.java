package LLD1_3;

import static LLD1_3.A.*;

public class Client {
    public static void main(String[] args) {
        A o1 = new A();
        o1.x = 2;
        o1.y = 3;
        o1.z = 25;
        A o2 = new A();
        o2.x = 20;
        o2.y = 30;
        o2.z = 50;

        A.z = 100;

        System.out.println(o1.z + " " + o2.z + " " + A.z);

        o1.fun(); // non static call
        A.sfun();  // static func call

    }
}
