package com.company.Kattis;

import java.util.Scanner;

public class Hacks {
    public static void main(String[] args) {

        int count = 0;
        int revenue_no = 0, revenue_yes = 0, cost = 0;
        Scanner in = new Scanner(System.in);

        count = in.nextInt();

        for(int i = 0; i < count; i++)
        {
            revenue_no = in.nextInt();
            revenue_yes = in.nextInt();
            cost = in.nextInt();

            if(revenue_yes < (cost + revenue_no))
            {
                System.out.println("do not advertise");
            }

            else if(revenue_yes > (cost + revenue_no))
            {
                System.out.println("advertise");
            }

            else
            {
                System.out.println("does not matter");
            }
        }
        in.close();
    }
}
