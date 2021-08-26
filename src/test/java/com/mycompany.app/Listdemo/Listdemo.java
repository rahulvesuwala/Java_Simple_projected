package com.mycompany.app.Listdemo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Listdemo {
    public static void main(String args[]){
        List<String>r1=new ArrayList<>();
        r1.add("bicycle");
        r1.add("bike");
        r1.add("car");
        r1.add("a");
        System.out.println(r1);
        r1.remove(1);
        System.out.println(r1);
        r1.set(1,"dates");
        System.out.println(r1);
        Collections.sort(r1);
        System.out.println(r1);
        System.out.println(r1.size());
        System.out.println(r1.get(1));

    }
}
