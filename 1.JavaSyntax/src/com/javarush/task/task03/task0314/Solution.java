package com.javarush.task.task03.task0314;
/*
Таблица умножения
*/
public class Solution {
    public static void main(String[] args) {
        for(int i=1,j=1;j<11;i++){
            if(i==10){
                System.out.println(i*j++);
                i=0;
            }else System.out.print(i*j+" ");
        }
    }
}