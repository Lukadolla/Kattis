package com.company.Kattis;

import java.util.Scanner;

public class Days_of_week {
    public static void main(String[] args) {

        int date = 0, month = 0, year = 2009;
        Scanner in = new Scanner(System.in);

        String[] days = new String[7];
         days = new String[]{"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

        date = in.nextInt();
        month = in.nextInt();

        int day;

        if(month == 1)  /*Exceptions specified in the algorithm for January and February*/
        {
            month = 13;
            year = year - 1;
        }

        if(month == 2)
        {
            month = 14;
            year = year - 1;
        }

        day = ((date + (13*(month + 1)/5) + (year%100) + ((year%100)/4) + ((year/100)/4) + 5*(year/100)) % 7);	/*Formula itself to calculate the day of the week given a date*/
        System.out.println(days[day]);
    }
}
