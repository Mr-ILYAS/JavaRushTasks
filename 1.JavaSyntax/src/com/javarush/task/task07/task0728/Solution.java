package com.javarush.task.task07.task0728;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
В убывающем порядке

Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.

Требования:
1. Программа должна считывать 20 целых чисел с клавиатуры.
2. Программа должна выводить 20 чисел.
3. Метод main должен вызывать метод sort.
4. Метод sort должен сортировать переданный массив по убыванию.
*/
public class Solution{
    public static void main(String[] args) throws Exception{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int[] array=new int[20];
        for(int i=0;i<20;array[i++]=Integer.parseInt(reader.readLine())) ;
        sort(array);
        for(int x:array)System.out.println(x);
    }
    public static void sort(int[] array){
        for(int i=0,k;i<20;i++){
            for(int j=19;j>0;j--){
                if(array[j]>array[j-1]){
                    k=array[j-1];
                    array[j-1]=array[j];
                    array[j]=k;
                }
            }
        }
    }
}