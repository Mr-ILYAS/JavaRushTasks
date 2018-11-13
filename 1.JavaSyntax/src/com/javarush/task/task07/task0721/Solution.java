package com.javarush.task.task07.task0721;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
/*
Минимаксы в массивах

Создать массив на 20 чисел.
Заполнить его числами с клавиатуры.
Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.

Требования:
1. Создай массив целых чисел (int[]) на 20 элементов.
2. Считай с клавиатуры 20 целых чисел и добавь их в массив.
3. Найди и выведи через пробел максимальное и минимальное числа.
4. Используй цикл for.
*/
public class Solution{
    public static void main(String[] args) throws IOException{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int[] list=new int[20];
        int maximum=Integer.parseInt(reader.readLine());
        int minimum=maximum;
        list[0]=maximum;
        for(int i=1,k;i<20;i++){
            list[i]=k=Integer.parseInt(reader.readLine());
            if(k>maximum)maximum=k;
            else if(k<minimum)minimum=k;
        }
        System.out.println(maximum+" "+minimum);
    }
}