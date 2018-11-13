package com.javarush.task.task04.task0442;
/*
Суммирование
*/
import java.io.*;
public class Solution{
    public static void main(String[] args) throws Exception{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        for(int sum=0,i;true;){
            i=Integer.parseInt(reader.readLine());
            sum+=i;
            if(i==-1){
                System.out.print(sum);
                break;
            }
        }
    }
}