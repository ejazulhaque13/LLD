package LLD1_13.Demo1;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable{
    Counter c1;

    Adder(Counter c){
        this.c1 = c;

    }

    @Override
    public void run() {

        for (int i=0; i<10000; i++){
            synchronized (c1) {
                c1.val++;
            }
        }

    }
}
