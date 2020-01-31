package com.company.Kattis;

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {

        int X = 0, Y = 0, N = 0;
        Scanner in = new Scanner(System.in);

        X = in.nextInt();
        Y = in.nextInt();
        N = in.nextInt();

        for(int i = 1; i <= N; i++)
        {
            if(i%X == 0 && i%Y == 0)
            {
                System.out.println("FizzBuzz");
            }

            else if(i%Y == 0)
            {
                System.out.println("Buzz");
            }

            else if(i%X == 0)
            {
                System.out.println("Fizz");
            }

            else
            {
                System.out.println(i);
            }
        }
    }
}
