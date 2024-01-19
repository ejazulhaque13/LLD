package LLD1_4;

import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        int[] arr = {2,5,8,6,3,12,10};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        String[] sarr = {"Hello", "World", "Bye", "Universe"};
        Arrays.sort(sarr);
        System.out.println(Arrays.toString(sarr));


        B b = new B();
        b.d1 = 2;  // Inheritance happening
        b.fun1();   // B is calling function of A and setting the data member of A
    }
}
