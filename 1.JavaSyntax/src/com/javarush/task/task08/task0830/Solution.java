package com.javarush.task.task08.task0830;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
Задача по алгоритмам

Задача: Введи с клавиатуры 20 слов и выведи их в алфавитном порядке.

Требования:
1. Программа должна выводить текст на экран.
2. Программа должна считывать значения с клавиатуры.
3. Класс Solution должен содержать три метода.
4. Метод main() должен вызывать метод sort().
5. Метод sort() должен вызывать метод isGreaterThan().
6. Выведенные слова должны быть отсортированы в алфавитном порядке.
*/
public class Solution{
    public static void main(String[] args) throws Exception{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String[] array=new String[20];
        for(int i=0;i<array.length;array[i++]=reader.readLine());
        sort(array);
        for(String x : array)System.out.println(x);
    }
    public static void sort(String[] array){
        for(int i=0,k=array.length-1;i<k;){
            int j=i+1;
            String temp;
            if(isGreaterThan(array[i],array[j])){
                temp=array[j];
                array[j]=array[i];
                array[i]=temp;
                if(i>0)i--;
            }else i++;
        }
    }
    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a,String b){return a.compareTo(b)>0;}
}