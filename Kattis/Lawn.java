package com.company.Kattis;

import java.util.Scanner;

public class Lawn {
    public static void main(String[] args) {

        double cost;
        int number_to_sow;
        double width, length;
        double area;
        double answer = 0;
        Scanner in = new Scanner(System.in);

        cost = in.nextDouble();
        number_to_sow = in.nextInt();

        for(int i = 0; i < number_to_sow; i++)
        {
            width = in.nextDouble();
            length = in.nextDouble();

            area = width*length;

            answer += area*cost;
        }
        System.out.println(answer);
        in.close();
    }
}
