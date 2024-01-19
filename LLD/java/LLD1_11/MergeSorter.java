package LLD1_11;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

public class MergeSorter implements Callable<Integer> {
    List<Integer> listToSort;
    ExecutorService es;


    MergeSorter(List<Integer> listToSort) {
        this.listToSort = listToSort;
        this.es = es;
    }

    @Override
    public Integer call() throws Exception {
        return null;
    }
}

