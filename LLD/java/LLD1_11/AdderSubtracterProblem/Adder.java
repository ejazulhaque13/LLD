package LLD1_11.AdderSubtracterProblem;

public class Adder implements Runnable{
    Counter c1;

    Adder(Counter c){
        this.c1 = c;
    }

    @Override
    public void run() {
        for (int i=0; i<10000; i++){
            c1.val++;
        }
    }
}
