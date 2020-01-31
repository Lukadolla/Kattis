package com.company.Kattis;

import java.util.Scanner;

public class R2 {
    public static void main(String[] args) {

        int R1 = 0, S = 0, R2 = 0;
        Scanner in = new Scanner(System.in);

        R1 = in.nextInt();
        S = in.nextInt();

        R2 = S*2 - R1;
        System.out.println(R2);

        in.close();
    }
}
