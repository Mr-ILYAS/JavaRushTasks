package com.javarush.task.task03.task0308;
/*
Произведение 10 чисел
*/
public class Solution {
    public static void main(String[] args) {
        int k=1;
        for(int i=0;i<10;)k*=++i;
        System.out.println(k);
    }
}