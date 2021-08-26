package com.mycompany.app.InterfaceDemo;
interface test{
    void display();
}

interface test2{
    void show();
}
class   InterfaceDemo implements test,test2{

    @Override
    public void display() {
        System.out.println("hi");

    }

    @Override
    public void show() {
        System.out.println("welcome");

    }
    public static void main(String args[]){
        InterfaceDemo o1=new InterfaceDemo();
        o1.display();
        o1.show();
    }
}
