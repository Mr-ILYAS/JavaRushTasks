package com.javarush.task.task04.task0432;
/*
Хорошего много не бывает
*/
import java.io.*;
public class Solution{
    public static void main(String[] args) throws Exception{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String s=reader.readLine();
        int i=0, num=Integer.parseInt(reader.readLine());
        while(i++<num)System.out.println(s);
    }
}