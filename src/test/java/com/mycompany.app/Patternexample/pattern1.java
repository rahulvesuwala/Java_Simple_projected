package com.mycompany.app.Patternexample;
public class pattern1 {
public static void main(String arg[]){
int a,b,c=6;
    for (a=0; a<c; a++)
    {
        for (b=c-a; b>1; b--)
        {
            System.out.print(" ");
        }
       for (b=0; b<=a; b++ )
        {
            System.out.print("* ");
        }
        System.out.println();
    }
}
}
