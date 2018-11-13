package com.javarush.task.task08.task0827;
import java.util.Date;
/*
Работа с датой

1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней
   с начала года — нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.

Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false

Требования:
1. Программа должна выводить текст на экран.
2. Класс Solution должен содержать два метода.
3. Метод isDateOdd() должен возвращать true, если количество дней с начала года - нечетное число, иначе false.
4. Метод main() должен вызывать метод isDateOdd().
*/
public class Solution{
    public static void main(String[] args){
        System.out.println(isDateOdd("MAY 1 2013"));
    }
    public static boolean isDateOdd(String date){
        Date yearStartTime=new Date(date);
        yearStartTime.setHours(0);
        yearStartTime.setMinutes(0);
        yearStartTime.setSeconds(0);
        yearStartTime.setDate(1);
        yearStartTime.setMonth(0);
        Date finishTime=new Date(date);
        finishTime.setHours(0);
        finishTime.setMinutes(0);
        finishTime.setSeconds(0);
        long msTimeDistance=finishTime.getTime()-yearStartTime.getTime();
        int dayCount=1+(int)(msTimeDistance/86400000L);
        return dayCount%2!=0;
    }
}