package LLD1_9.Demo1;

public class Client {
    public static void main(String[] args) {
        System.out.println("Hi from" + " " + Thread.currentThread().getName());

        for(int i=1; i<=100; i++) {
           NumberPrinter np = new NumberPrinter(i);
           Thread t = new Thread(np);
           t.start();
        }
        System.out.println("Bye from" + " " + Thread.currentThread().getName());
    }
}
