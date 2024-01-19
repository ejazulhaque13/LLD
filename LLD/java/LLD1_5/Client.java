package LLD1_5;

public class Client {
    public static void main(String[] args) {
        int x = 10;
        final int y = 20;
        x =30;
       //  y=40; // cannot change the value since it is a final variable
        C obj = new C();
        C obj2 = new C(10,20,30);

        obj.fun(); // calling all the fun since super is used
    }
}
