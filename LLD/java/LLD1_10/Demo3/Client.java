package LLD1_10.Demo3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        GreetingsCreator gc = new GreetingsCreator();
        ExecutorService es = Executors.newFixedThreadPool(10);

        Future<String> promiseOfAGreeting = es.submit(gc);

        // Any work not related to greeting
        System.out.println("Task no related to greeting");
        int mult = 2*5;
        System.out.println(mult);

        String greeting = promiseOfAGreeting.get(); //get is a blocking statement

        System.out.println(greeting);
        es.shutdown();
    }
}
