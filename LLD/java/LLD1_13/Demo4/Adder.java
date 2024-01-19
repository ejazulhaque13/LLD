package LLD1_13.Demo4;

public class Adder implements Runnable{
    Counter c1;

    Adder(Counter c){
        this.c1 = c;

    }

    @Override
    public void run() {

        for (int i=0; i<10000; i++){
                c1.val.addAndGet(i);

        }

    }
}
