package com.javarush.task.task08.task0828;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
/*
Номер месяца

Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.

Требования:
1. Программа должна выводить текст на экран.
2. Программа должна считывать значения с клавиатуры.
3. Класс Solution должен содержать один метод.
4. Программа должна использовать коллекции.
5. Программа должна считывать с клавиатуры имя месяца и выводить его номер на экран по заданному шаблону.
*/
public class Solution{
    public static void main(String[] args) throws IOException{
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        String monthIn=buf.readLine();
        ArrayList<String> months=new ArrayList<>();
        months.add(0,"January");
        months.add(1,"February");
        months.add(2,"March");
        months.add(3,"April");
        months.add(4,"May");
        months.add(5,"June");
        months.add(6,"July");
        months.add(7,"August");
        months.add(8,"September");
        months.add(9,"October");
        months.add(10,"November");
        months.add(11,"December");
        for(int i=0;i<12;i++){
            if(monthIn.compareToIgnoreCase(months.get(i))==0){
                System.out.println(months.get(i)+" is "+(i+1)+" month");
                break;
            }
        }
    }
}