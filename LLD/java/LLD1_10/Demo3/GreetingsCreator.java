package LLD1_10.Demo3;

import LLD1_5.C;

import java.util.Random;
import java.util.concurrent.Callable;

public class GreetingsCreator implements Callable<String> {
    Random r = new Random();
    @Override
    public String call() throws Exception {
        int num = Math.abs( r.nextInt() % 5);
        if(num==0) {
            return "Hello";
        } else if (num==1) {
            return "Hola";
        } else if (num==2) {
            return "Namaste";
        } else if (num==3) {
            return "AslaamValekum";
        } else if (num==4) {
            return "Hi";
        }
        else {
            return "no greeting for you";
        }
    }
}
