package com.javarush.task.task04.task0419;
/*
Максимум четырех чисел
*/
import java.io.*;
public class Solution{
    public static void main(String[] args) throws Exception{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(reader.readLine());
        int b=Integer.parseInt(reader.readLine());
        int c=Integer.parseInt(reader.readLine());
        int d=Integer.parseInt(reader.readLine());
        a=a>b?a:b;
        b=c>d?c:d;
        System.out.println(a>b?a:b);
    }
}
