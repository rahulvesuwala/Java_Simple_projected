package com.mycompany.app.Arrayexample;

import java.util.Scanner;



public class arraychar{
        public static void main(String[] args)
        {
            String s;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter The Value ");
            s = sc.nextLine();
            int j = 0;
            char K = 0;
            char[] ch = s.toCharArray();
            //System.out.println(ch);
            for (int i = 0; i < ch.length; i++) {
                for (j = 0; j < ch.length; j++) {
                    if (ch[j] > ch[i]) {
                        K = ch[i];
                        ch[i] = ch[j];
                        ch[j] = K;
                    }
                }
            }
           System.out.println("Result Is ");
            for (int i = 0; i < ch.length; i++) {
           System.out.print(ch[i]);
            }

        }
}