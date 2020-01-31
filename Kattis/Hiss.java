package com.company.Kattis;

import java.util.Scanner;

public class Hiss {
    public static void main(String[] args) {

        String s = "";
        Scanner in = new Scanner(System.in);

        s = in.next();

        if(s.contains("ss"))
        {
            System.out.println("hiss");
        }

        else
        {
            System.out.println("no hiss");
        }
        in.close();
    }
}
