package com.company.Kattis;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {

        int n, h, v;
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        h = in.nextInt();
        v = in.nextInt();

       if(h <= n/2)
       {
           h = n - h;
       }

       if(v <= n/2)
       {
           v = n - v;
       }

       System.out.println(h*v*4);
       in.close();
    }
}
