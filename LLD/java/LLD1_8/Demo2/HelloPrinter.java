package LLD1_8.Demo2;

public class HelloPrinter implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello World from a class runnoing from a seperate thread" + " " + Thread.currentThread().getName());

        int a = 5;
        int b = 10;
        int c = a*b;
        dosomething();
    }
    void dosomething() {
        System.out.println("Hello WOrld from a new class, dosomething " + " " + Thread.currentThread().getName());
    }
}
