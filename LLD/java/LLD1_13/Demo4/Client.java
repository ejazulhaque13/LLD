package LLD1_13.Demo4;

// This class is made in such a way that we are the creator of Counter and people are using
// adder and subtractor as a client hence it is using synchronised method
public class Client {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        c.val.set(10);

        Adder a = new Adder(c);
        Subtractor s = new Subtractor(c);

        Thread t1 = new Thread(a);
        t1.start();

        Thread t2 = new Thread(s);
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c.val.get());

    }
}
