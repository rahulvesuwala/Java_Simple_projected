
package com.mycompany.app.Constructorexample;
public class constructorobjectclass {

    int len;
    int wid;
    constructorobjectclass(int l,int w){
    len=l;
    wid=w;
    }

void area(){
   System.out.println(len*wid);
}

    public static void main(String arg[]){
        constructorobjectclass t1=new constructorobjectclass(2,3);
        constructorobjectclass t2=new constructorobjectclass(3,4);
        constructorobjectclass t3=new constructorobjectclass(4,5);
        t1.area();
        t2.area();
        t3.area();

    }}