package LLD1_10.Demo1;

public class NumberPrinter implements Runnable{
    private int numToPrint;

    public NumberPrinter(int num) {
        this.numToPrint=num;
    }
    @Override
    public void run() {
        System.out.println(numToPrint + " printed by thread " + Thread.currentThread().getName());

    }
}
