package LLD1_13.Demo3;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

public class Client {
    public static void main(String[] args) {
        // Just to see the syncronised methods in all the DATA STRUCTURES
        HashMap<Integer,Integer> hm = new HashMap<>();
        Hashtable<Integer,Integer> hm1 = new Hashtable<>();
        ConcurrentHashMap<Integer,Integer> hm2 = new ConcurrentHashMap<>();
        // Press ctrl+click to reach to the location

        StringBuffer sb = new StringBuffer(); //synchronised/thread-safe
        StringBuilder sb1 = new StringBuilder(); // not synchronised/ not thread-safe
    }
}
