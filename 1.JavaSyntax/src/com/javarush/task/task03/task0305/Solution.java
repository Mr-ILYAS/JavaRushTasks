package com.javarush.task.task03.task0305;
/*
Я так давно родился
*/
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
public class Solution {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(1991,7,1);
        SimpleDateFormat format = new SimpleDateFormat("MMMM dd yyy",Locale.ENGLISH);
        System.out.println(format.format(c.getTime()).toUpperCase());
    }
}