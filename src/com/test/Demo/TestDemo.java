package com.test.Demo;

public class TestDemo {
    public static void main(String[] args) {
        Youtiao youtiao =new Youtiao();new Supermarket(youtiao).start();
        new Cust(youtiao).start();

    }
}
