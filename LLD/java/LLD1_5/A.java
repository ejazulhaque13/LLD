package LLD1_5;

public class A {
    int x;
    int d1;

    A(){
        d1=10;
    }
    A(int d1) {
        this.d1=d1;
    }
    final int y=10; // we cannot change the value of y since it is final
    void fun() {

        System.out.println("I am fun from A");
    }
    final void fun1() { // since it is a final method it cannot be overridden

    }
}
