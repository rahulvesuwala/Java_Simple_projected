package com.mycompany.app.MethodOverridingexample;
class method{
    int add(int a,int b){

    return a+b;
    }
}
class method1 extends method{
    int add(int a ,int b)
    {
        return a+b;
    }
}


class method2 extends method1{
    int add(int a ,int b){
        return a+b;
    }
}

class method3 extends method2{
    int add(int a ,int b){
        return a+b;
    }
}

public class methodexample {

public static void main(String args[]){
    method o;
    o=new method1();
    method1 o1=new method1();
    method2 o2=new method2();
    method3 o3=new method3();
    System.out.println("method1 sum :- "+o1.add(2,3));
    System.out.println("method2 sum :- "+o2.add(5,5));
    System.out.println("method3 sum  :- "+o3.add(10,10));
}
}


