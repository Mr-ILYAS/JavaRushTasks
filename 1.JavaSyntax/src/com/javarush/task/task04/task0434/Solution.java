package com.javarush.task.task04.task0434;
/*
Таблица умножения
*/
public class Solution{
    public static void main(String[] args) throws Exception{
        int i=1, j=1;
        while(j<11){
            if(i==10){
                System.out.println(i*j++);
                i=0;
            }
            else System.out.print(i*j+" ");
            i++;
        }
    }
}