package LLD1_7.DemoOnDataMembers;

public class client {
    public static void main(String[] args) {
        I o1 = new C();
        o1.fun();
        System.out.println(o1.x);

        I o2 = new C();
        o2.fun();
        System.out.println(o2.x);
        System.out.println(I.x);

    }
}
