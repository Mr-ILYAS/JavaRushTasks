package com.javarush.task.task08.task0813;
import java.util.HashSet;
/*
20 слов на букву «Л»

Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».

Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Класс Solution должен содержать только два метода.
4. Метод createSet() должен создавать и возвращать множество HashSet.
5. Множество из метода createSet() должно содержать 20 слов на букву «Л».
*/
public class Solution{
    public static HashSet<String> createSet(){
        HashSet<String> list=new HashSet<>();
        for(int i=0;i++<20;list.add("Л"+i));
        return list;
    }
    public static void main(String[] args){}
}