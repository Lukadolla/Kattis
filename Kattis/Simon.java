package com.company.Kattis;

import java.util.Scanner;

public class Simon {
    public static void main(String[] args) {

        String input;
        int count;
        Scanner in = new Scanner(System.in);

        count = in.nextInt();

        for(int i = 0; i <= count; i++)
        {
            input = in.nextLine();

            if(input.contains("Simon says"))
            {
                System.out.println(input.replace("Simon says", ""));
            }
        }

        in.close();
    }
}
