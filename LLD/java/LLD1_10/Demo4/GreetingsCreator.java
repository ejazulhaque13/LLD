package LLD1_10.Demo4;

import java.util.Random;
import java.util.concurrent.Callable;

public class GreetingsCreator implements Callable<String> {
    Random r = new Random();
    @Override
    public String call() throws Exception {
        int num = Math.abs( r.nextInt() % 5);
        if(num==0) {
            return "Hello" + Thread.currentThread().getName();
        } else if (num==1) {
            return "Hola" + Thread.currentThread().getName();
        } else if (num==2) {
            return "Namaste" + Thread.currentThread().getName();
        } else if (num==3) {
            return "AslaamValekum" + Thread.currentThread().getName();
        } else if (num==4) {
            return "Hi" + Thread.currentThread().getName();
        }
        else {
            return "no greeting for you" + Thread.currentThread().getName();
        }
    }
}
