package com.solve.BEGINNER;

import java.util.Scanner;

public class Problem1061 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s_day, s_time, e_day, e_time;
        String s_split_time[], e_split_time[];
        int start_day, end_day, start_hour, end_hour, start_minute, end_minute,
                start_second, end_second, day = 0, hour = 0, minute = 0, second = 0;
        s_day = sc.nextLine();
        s_time = sc.nextLine();
        e_day = sc.nextLine();
        e_time = sc.nextLine();
        start_day = toInt(s_day);
        end_day = toInt(e_day);
        s_split_time = s_time.split(" : ");
        e_split_time = e_time.split(" : ");
        start_hour = stoInt(s_split_time[0]);
        start_minute = stoInt(s_split_time[1]);
        start_second = stoInt(s_split_time[2]);
        end_hour = stoInt(e_split_time[0]);
        end_minute = stoInt(e_split_time[1]);
        end_second = stoInt(e_split_time[2]);
        //second:
        if (end_second >= start_second) {
            second = end_second - start_second;
        } else {
            second = end_second - start_second + 60;
            end_minute = end_minute - 1;
        }
        //minute:
        if (end_minute >= start_minute) {
            minute = end_minute - start_minute;
        } else {
            minute = end_minute - start_minute + 60;
            end_hour = end_hour - 1;
        }
        //hour:
        if (end_hour >= start_hour) {
            hour = end_hour - start_hour;
        } else {
            hour = end_hour - start_hour + 24;
            end_day = end_day - 1;
        }
        //day:
        if (end_day >= start_day) {
            day = end_day - start_day;
        }
        System.out.println(day + " dia(s)");
        System.out.println(hour + " hora(s)");
        System.out.println(minute + " minuto(s)");
        System.out.println(second + " segundo(s)");
    }
    private static Integer toInt(String start_day) {
        return Integer.valueOf(start_day.substring(4).trim());
    }
    private static Integer stoInt(String start_day) {
        return Integer.valueOf(start_day.trim());
    }
}
