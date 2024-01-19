package LLD1_13.Demo2;

public class Counter {
    private int val = 0;

    public Counter(int val){
        this.val=val;
    }

    public synchronized void incVal(int offset) {
        val+=offset;
    }

    public synchronized int getVal(){
        return val;
    }
}
