package com.mycompany.app.Staticexample;
public class Staticdemo {
   static{
        System.out.println("static block is First run");
    }

    static int c=0;
    static class newdemo{
        void name1(){
            System.out.println("Welcome");
        }}
  //not use static class

    class demo{
        void name(){
            System.out.println("last run");
        }}

    Staticdemo() {
    c++;
    System.out.println(c);}
    static void show()
    {
        System.out.println("hi");
    }

public static void main(String arg[]){

    Staticdemo t1=new Staticdemo();
    Staticdemo t2=new Staticdemo();
    Staticdemo t3=new Staticdemo();
    Staticdemo.show();
    Staticdemo.newdemo o1=new Staticdemo.newdemo();
    o1.name1();
    //not use static class
    Staticdemo o2=new Staticdemo();
    demo o3=o2.new demo();
    o3.name();
    }
}

