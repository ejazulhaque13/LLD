package LLD1_11;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> list = Arrays.asList(2,7,9,1,4,3,6,7);
        ExecutorService es = Executors.newFixedThreadPool(10);

        MergeSorter ms = new MergeSorter(list);
        Future<Integer> PromiseofasortedList = es.submit(ms);

        List<Integer> sortedList = Collections.singletonList(PromiseofasortedList.get());
        System.out.println(sortedList);

        es.shutdown();

    }
}
