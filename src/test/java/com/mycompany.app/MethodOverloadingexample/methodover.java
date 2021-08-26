package com.mycompany.app.MethodOverloadingexample;


public class methodover {
static int add(int a ,int b){
    return a+b;

}
static double add(double a,double b){
    return a+b;
}
public static void main(String args[]){

    System.out.println(add(1,3));
    System.out.println(add(11.4,11.2));

}
}


