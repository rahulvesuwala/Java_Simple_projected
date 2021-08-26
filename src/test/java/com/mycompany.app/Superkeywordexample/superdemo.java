package com.mycompany.app.Superkeywordexample;
class color{
    String color="red";
    void disPlay(){
        String color="white";
        System.out.println(color);
    }

}
class newcolor extends color{
    String color="black";

    newcolor(){
        //super constructor

        super();
        System.out.println("All Color Print");

    }
    void disPlay(){
        System.out.println(color);
       //super variable
        System.out.println(super.color);
        //super method
        super.disPlay();

    }

}

public class superdemo {
public static void main(String args[]){
     newcolor o1= new newcolor();
     o1.disPlay();

    }
}

