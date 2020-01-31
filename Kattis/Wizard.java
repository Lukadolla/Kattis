package com.company.Kattis;
import java.util.Scanner;

public class Wizard {
    public static void main(String[] args) {

        int spells = 0;
        Scanner in = new Scanner(System.in);

        spells = in.nextInt();

        for(int i = 1; i <= spells; i++)
        {
            System.out.println(i + " Abracadabra");
        }
        in.close();
    }
}
