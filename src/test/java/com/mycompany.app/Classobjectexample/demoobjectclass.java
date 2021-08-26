package com.mycompany.app.Classobjectexample;

public class demoobjectclass {
    public static void main(String arg[]) {

        test t1 = new test();
        test t3 = new test(),
        t2 = new test();
        t1.ins(2, 3);
        t2.ins(4, 6);
        t3.ins(3, 4);
        t1.area();
        t2.area();
        t3.area();

    }
}
class test{
    int len;
    int wid;
    void ins(int l,int w){
    len=l;
    wid=w;

    }

void area(){
   System.out.println(len*wid);
}
}