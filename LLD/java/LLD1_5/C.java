package LLD1_5;

public class C extends B{
    int d3;

    C(){
        this.d3=30;
    }

    C(int d1,int d2, int d3) {
        super(d1, d2); // Using the super keyword
        this.d3=d3;

    }
    void fun(){
        super.fun();
        System.out.println("I am fun from C");
    }
}
