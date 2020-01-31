package com.company.Kattis;
import java.util.Scanner;

public class Quadrant_Selection {
    public static void main(String[] args) {

        int x, y;
        Scanner in = new Scanner(System.in);

        x = in.nextInt();
        y = in.nextInt();

        if(x > 0 && y > 0)
        {
            System.out.println(1);
        }

        else if(x < 0 && y > 0)
        {
            System.out.println(2);
        }

        else if(x < 0 && y < 0)
        {
            System.out.println(3);
        }

        else
        {
            System.out.println(4);
        }
        in.close();
    }
}
