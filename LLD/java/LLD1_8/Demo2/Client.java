package LLD1_8.Demo2;

public class Client {

    public static void main(String[] args) {
        System.out.println("Hello WOrld from =" +" " + Thread.currentThread().getName());

        int x=10;
        int y=20;
        int z=x+y;

        HelloPrinter hp = new HelloPrinter();
        //hp.run();

        Thread t = new Thread(hp);
        t.start();

        System.out.println("Bye World from =" + " " + Thread.currentThread().getName());
    }
}
