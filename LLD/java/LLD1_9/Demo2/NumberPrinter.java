package LLD1_9.Demo2;

public class NumberPrinter implements Runnable{
    private int numToPrint = 0;

    @Override
    public void run() {
        System.out.println(numToPrint + " printed by thread " + Thread.currentThread().getName());
        numToPrint++;

    }
}
