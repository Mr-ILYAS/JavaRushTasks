package com.javarush.task.task18.task1816;
import java.io.*;
/*
Английские буквы

В метод main первым параметром приходит имя файла.
Посчитать количество букв английского алфавита, которое есть в этом файле.
Вывести на экран число (количество букв).
Закрыть потоки.

Требования:
1. Считывать с консоли ничего не нужно.
2. Создай поток чтения из файла, который приходит первым параметром в main.
3. В файле необходимо посчитать буквы английского алфавита и вывести это число в консоль.
4. Нужно учитывать заглавные и строчные буквы.
5. Поток чтения из файла должен быть закрыт.
*/
public class Solution{
    public static void main(String[] args) throws IOException{
        BufferedReader reader=new BufferedReader(new FileReader(args[0]));
        StringBuilder sb=new StringBuilder();
        while(reader.ready())sb.append(reader.readLine());
        reader.close();
        System.out.println((sb+"\0").split("[a-zA-Z]").length-1);
    }
}