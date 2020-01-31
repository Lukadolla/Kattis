package com.company.Kattis;
import java.util.Scanner;

public class Stones {
    public static void main(String[] args) {

        int stones = 0;
        Scanner in = new Scanner(System.in);

        stones = in.nextInt();

        if(stones%2 == 0)
        {
            System.out.println("Bob");
        }

        else
        {
            System.out.println("Alice");
        }
        in.close();
    }
}
