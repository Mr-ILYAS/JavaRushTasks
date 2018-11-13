package com.javarush.task.task04.task0420;
/*
Сортировка трех чисел
*/
import java.io.*;
public class Solution{
    public static void main(String[] args) throws Exception{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(reader.readLine());
        int b=Integer.parseInt(reader.readLine());
        int c=Integer.parseInt(reader.readLine());
        int buf;
        if(a<b){
            buf=a;
            a=b;
            b=buf;
        }
        if(b<c){
            buf=b;
            b=c;
            c=buf;
        }
        if(a<b){
            buf=a;
            a=b;
            b=buf;
        }
        System.out.println(a+" "+b+" "+c);
    }
}