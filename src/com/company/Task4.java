package com.company;

public class Task4 {
    public void task4() {
        int a = 2;
        int b = 3;
        int r = 5;
        double diag =Math.sqrt( a * a +  b * b);
        r *=r;
        if(diag < r){
            System.out.println("close");
        }else{
            System.out.println("won't close");
        }
    }
}
