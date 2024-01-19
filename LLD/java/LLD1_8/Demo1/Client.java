package LLD1_8.Demo1;

import org.springframework.aop.scope.ScopedProxyUtils;

public class Client {
    public static void main(String[] args) {
        System.out.println("Hello WOrld from" +" " + Thread.currentThread().getName());
    }
    void dosomething() {
        System.out.println("Hello WOrld from " + " " + Thread.currentThread().getName());
    }
}
