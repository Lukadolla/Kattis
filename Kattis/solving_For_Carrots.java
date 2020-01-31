package com.company.Kattis;

import java.util.Scanner;

public class solving_For_Carrots {

    public static void main(String[] args) {

        int answer = 0;
        int count = 0;
        String temp;

        Scanner in = new Scanner(System.in);

        count = in.nextInt();
        answer = in.nextInt();

        while(count > 0)
        {
            temp = in.next();
            count--;
        }
        System.out.print(answer);
        in.close();
    }
}
