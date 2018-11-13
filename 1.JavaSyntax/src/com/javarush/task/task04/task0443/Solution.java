package com.javarush.task.task04.task0443;
/*
Как назвали, так назвали

Ввести с клавиатуры строку name.
Ввести с клавиатуры дату рождения (три числа): y, m, d.

Вывести на экран текст:
«Меня зовут name.
Я родился d.m.y»

Пример вывода:
Меня зовут Вася.
Я родился 15.2.1988


Требования:
1. Программа должна считывать строки c клавиатуры.
2. Программа должна выводить строки на экран.
3. Программа должна выводить текст, шаблон которого указан в задании.
4. Каждое предложение вывести с новой строки.
*/
import java.io.*;
public class Solution{
    public static void main(String[] args) throws Exception{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder s=new StringBuilder();
        String name=reader.readLine();
        int y=Integer.parseInt(reader.readLine()), m=Integer.parseInt(reader.readLine()), d=Integer.parseInt(reader.readLine());
        System.out.println(s.append("Меня зовут ").append(name).append(".\nЯ родился ").append(d).append(".").append(m).append(".").append(y));
    }
}