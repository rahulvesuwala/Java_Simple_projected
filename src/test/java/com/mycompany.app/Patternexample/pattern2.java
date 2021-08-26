package com.mycompany.app.Patternexample;



public class pattern2 {
    public static void main(String args[])
    {
        int a, b,c, n=5;

        for(a=0; a<n; a++)
        {
            c=1;

            for(b=0; b<=a; b++)
            {
                //System.out.print("1");
                System.out.print(c+ " ");
                c++;
            }
            System.out.println();
        }
    }
}
