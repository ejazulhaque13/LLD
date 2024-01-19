package LLD1_10.Demo4;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService es = Executors.newFixedThreadPool(10);
        ArrayList<Future<String>> allPromises = new ArrayList<>();

        for (int i =0; i<=100; i++) {
            GreetingsCreator gc = new GreetingsCreator();
            Future<String> promiseOfAGreeting = es.submit(gc);
            allPromises.add(promiseOfAGreeting);
        }

        // Any work not related to greeting
        System.out.println("unrelated work");


        for (Future<String> promises : allPromises) {
            String greeting = promises.get();
            System.out.println(greeting);
        }

        es.shutdown();
    }
}
