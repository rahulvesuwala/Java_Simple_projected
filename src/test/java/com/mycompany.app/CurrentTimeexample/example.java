package com.mycompany.app.CurrentTimeexample;

public class example {
    public static void main(String args[]) throws Exception{
        long start = System.currentTimeMillis();
        long end = start + 5000;
        while (System.currentTimeMillis() < end) {
            System.out.println("Rahul");        }
    }
}
