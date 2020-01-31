package com.company.Kattis;

import java.util.Scanner;

public class IsItHalloween {
    public static void main(String[] args) {

        String input;
        Scanner in = new Scanner(System.in);

        input = in.nextLine();

        if(((input.contains("OCT")) && (input.contains("31"))) || ((input.contains("DEC")) && (input.contains("25"))))
        {
            System.out.println("yup");
        }

        else
        {
            System.out.println("nope");
        }
        in.close();
    }
}
