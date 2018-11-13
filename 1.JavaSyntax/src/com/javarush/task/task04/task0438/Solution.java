package com.javarush.task.task04.task0438;
/*
Рисуем линии
*/
public class Solution {
    public static void main(String[] args) throws Exception {
        StringBuilder s1=new StringBuilder();
        StringBuilder s2=new StringBuilder();
        for(int i=1;true;i++){
            s1.append("8");
            s2.append("\n8");
            if(i==10){
                s1.append(s2);
                System.out.print(s1);
                break;
            }
        }
    }
}