package com.company.Kattis;

import java.util.Scanner;
import java.lang.Math;

public class Matches {
    public static void main(String[] args) {

        double N, W, H, max_size;
        int match = 0;
        Scanner in = new Scanner(System.in);

        N = in.nextDouble();
        W = in.nextDouble();
        H = in.nextDouble();
        max_size = Math.sqrt(Math.pow(W, 2) + Math.pow(H, 2));

        for(int i = 0; i < N; i++)
        {
            match = in.nextInt();

            if(match <= max_size)
            {
                System.out.println("DA");
            }

            else
            {
                System.out.println("NE");
            }
        }
        in.close();
    }
}
