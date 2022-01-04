package test;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;

public class Test {

    public static void main(String[] args) throws Exception {

        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        DayOfWeek week = date.getDayOfWeek();

        int today = date.getDayOfMonth();
        date = date.minusDays(today - 1);
        int value = date.getDayOfWeek().getValue();

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for (int i = 1; i < value; i++) {
            System.out.print("    ");
        }

        while (date.getMonthValue() == month) {
            System.out.printf("%3d", date.getDayOfMonth());
            if (date.getDayOfMonth() == today)
                System.out.print("*");
            else
                System.out.print(" ");

            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1)
                System.out.println();

        }
        if (date.getDayOfWeek().getValue() != 1) System.out.println();

    }
}
