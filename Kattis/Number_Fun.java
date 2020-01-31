package com.company.Kattis;
import java.util.Scanner;

public class Number_Fun {
    public static void main(String[] args) {

        double a, b, c;
        int number;
        Scanner in = new Scanner(System.in);

        number = in.nextInt();

        for(int i = 0; i < number; i++)
        {
            a = in.nextDouble();
            b = in.nextDouble();
            c = in.nextDouble();

            if((a + b) == c)
            {
                System.out.println("Possible");
            }

            else if((a - b) == c || (b - a) == c)
            {
                System.out.println("Possible");
            }

            else if((a * b) == c)
            {
                System.out.println("Possible");
            }

            else if((a / b) == c || (b / a) == c)
            {
                System.out.println("Possible");
            }

            else
            {
                System.out.println("Impossible");
            }
        }
        in.close();
    }
}
