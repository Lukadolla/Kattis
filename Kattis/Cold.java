package com.company.Kattis;

import java.util.Scanner;

public class Cold {

    public static void main(String[] args) {

        int input = 0, amount = 0, count = 0;
        Scanner in = new Scanner(System.in);

        amount = in.nextInt();

        for(int i = 0; i < amount; i++)
        {
            input = in.nextInt();

            if(input < 0)
            {
                count++;
            }
        }
        System.out.println(count);
        in.close();
    }
}
