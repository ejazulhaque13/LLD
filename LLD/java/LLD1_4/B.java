package LLD1_4;

public class B extends A {
    int d2;
    void fun2(){
        System.out.println("I am fun2 from B");
    }

    @Override
    void fun1() {
        System.out.println("I am fun1 from B"); // overiding the A's fun1 method
    }
}
