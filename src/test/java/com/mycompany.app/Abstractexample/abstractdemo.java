package com.mycompany.app.Abstractexample;

abstract class Shape{
    abstract void show();

}
class Rec extends Shape{

    @Override
    void show() {
    System.out.println("rectangle");
    }
}
class Cri extends Shape{

    @Override
    void show() {
     System.out.println("circle");
    }
}

public class abstractdemo {
    public static void main(String[] args) {
        Shape o1=new Cri();
        Shape o2=new Rec();
        o1.show();
        o2.show();
    }

}
