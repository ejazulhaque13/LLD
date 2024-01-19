package LLD1_15;

public class MoralOfTheStory {
    public static void main(String[] args) {
        int n = 1000000;
       // fun1(n);
        fun2(n);
    }
    //For String
    // 10 -> 6ms
    // 100 -> 6ms
    // 1000 -> 9ms
    // 10000 -> 63ms
    // 100000 -> 2476ms
    // 1000000 -> response never came back

    // For StringBuilder
    // 10 -> 0ms
    // 100 -> 0ms
    // 1000 -> 2ms
    // 10000 -> 1ms
    // 100000 -> 3ms
    // 1000000 -> 24ms
    static void fun1(int n){
        long starting = System.currentTimeMillis();

        String s = "";
        for(int i =1; i<=n; i++){
            s=s+i;
        }

        long ending = System.currentTimeMillis();
        long duration = ending-starting;
        System.out.println("Loop of size " + n + " time take is " + duration);
    }
    static void fun2(int n){
        long starting = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder("");
        for(int i =1; i<=n; i++){
            sb.append(i);
        }

        long ending = System.currentTimeMillis();
        long duration = ending-starting;
        System.out.println("Loop of size " + n + " time take is " + duration);
    }

}
