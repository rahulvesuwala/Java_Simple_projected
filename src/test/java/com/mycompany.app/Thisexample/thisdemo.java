package com.mycompany.app.Thisexample;
public class thisdemo {

    int len;
    int wid;
    thisdemo(){
        this(10,20);
    }
    thisdemo(int len,int wid){
        this.len=len;
        this.wid=wid;

    }
    void area(){
        System.out.println(len*wid);
    }

    public static void main(String arg[]){
       thisdemo t1=new thisdemo(2,3);
        thisdemo t2=new thisdemo();
        thisdemo t3=new thisdemo(4,5);
        t1.area();
        t2.area();
        t3.area();

    }
}
