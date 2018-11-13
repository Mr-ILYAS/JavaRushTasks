package com.javarush.task.task13.task1326;
import java.io.*;
import java.util.*;
/*
Сортировка четных чисел из файла

1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.

Пример ввода:
5
8
11
3
2
10

Пример вывода:
2
8
10

Требования:
1. Программа должна считывать данные с консоли.
2. Программа должна вывести на экран все четные числа считанные из файла отсортированные по возрастанию.
3. Программа должна выводить данные на экран.
4. Программа должна закрывать поток чтения из файла(FileInputStream).
*/
public class Solution{
    public static void main(String[] args) throws IOException{
        InputStream inStream=new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        ArrayList<Integer> list=new ArrayList<>();
        int data;
        while(inStream.available()>0){
            data=Character.getNumericValue(inStream.read());
            if(data%2==0)
                list.add(data);
        }
        Collections.sort(list);
        for(int i:list)
            System.out.println(i);
    }
}