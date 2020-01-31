package com.company.Kattis;

import java.util.Scanner;

public class Phd {
    public static void main(String[] args) {

        int a, b;
        int number;
        String temp;
        Scanner in = new Scanner(System.in);

        number = in.nextInt();

        for(int i = 0; i < number; i++)
        {
            temp = in.next();

            if(temp.equals("P=NP"))
            {
                System.out.println("skipped");
            }

            else
            {
                if(!(temp.contains("+")))
                {
                    a = Integer.parseInt(temp);
                }

                else
                {
                    int plus = temp.indexOf('+');

                    a = Integer.parseInt(temp.substring(0, plus));
                    b = Integer.parseInt(temp.substring(plus + 1, temp.length()));

                    System.out.println((a + b));
                }

            }

        }
        in.close();
    }
}
