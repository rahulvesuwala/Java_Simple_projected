package com.mycompany.app.Inheritanceexample;
    class appName  {
        void show() {
            System.out.println("hi");
        }
    }
    class baseLast extends appName {
        void disPlay() {
            System.out.println("Welcome");
        }
    }
  public class inheritanceDemo {
    public static void main(String[] args) {
        baseLast o1 = new baseLast();
        o1.show();
        o1.disPlay();

    }
    }

