package com.mycompany.app.Arrayexample;

public class arrayNumbersort
{
    public static void main(String arg[]){
    int [] a = new int[] {110,8,3,4,1};
    int i=0;
    for (int j = 0; j < a.length; j++) {
            for (int k = j+1; k < a.length; k++) {
                if(a[j] > a[k]) {
                    i = a[j];
                    a[j] = a[k];
                    a[k] = i;
                }
            }
        }

        System.out.println("ascending number: ");
        for (int j = 0; j < a.length; j++) {
            System.out.print(a[j] + " ");
        }
    }
}
