package com.javarush.task.task04.task0428;
/*
Положительное число

Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел в исходном наборе.

Примеры:
а) при вводе чисел -4 6 6 получим вывод 2

б) при вводе чисел -6 -6 -3 получим вывод 0

Требования:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить число на экран.
3. Программа должна выводить количество положительных чисел в исходном наборе.
4. Если положительных чисел нет, программа должна вывести "0".
*/
import java.io.*;
public class Solution{
    public static void main(String[] args) throws Exception{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int i=0;
        if(Integer.parseInt(reader.readLine())>0)i++;
        if(Integer.parseInt(reader.readLine())>0)i++;
        if(Integer.parseInt(reader.readLine())>0)i++;
        System.out.println(i);
    }
}