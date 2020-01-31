package com.company.Kattis;

import java.util.Scanner;

public class Odd_or_Even {
    public static void main(String[] args) {

        int count, input;
        Scanner in = new Scanner(System.in);

        count = in.nextInt();

        for(int i = 0; i < count; i++)
        {
            input = in.nextInt();

            if(input%2 == 0)
            {
                System.out.println(input + " is even");
            }

            if(input%2 != 0)
            {
                System.out.println(input + " is odd");
            }
        }
        in.close();
    }
}
