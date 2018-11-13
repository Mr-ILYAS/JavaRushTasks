package com.javarush.task.task04.task0415;
/*
Правило треугольника

Ввести с клавиатуры три числа а, b, c – стороны предполагаемого треугольника.
Определить возможность существования треугольника по сторонам.
Результат вывести на экран в следующем виде:
«Треугольник существует.» — если треугольник с такими сторонами существует.
«Треугольник не существует.» — если треугольник с такими сторонами не существует.

Подсказка:
Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей.
Требуется сравнить каждую сторону с суммой двух других.
Если хотя бы в одном случае сторона окажется больше или равна сумме двух других, то треугольника с такими сторонами не существует.


Требования:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить текст на экран.
3. Если треугольник с такими сторонами может существовать, необходимо вывести текст: "Треугольник существует."
4. Если треугольник с такими сторонами не может существовать, необходимо вывести текст: "Треугольник не существует."
*/
import java.io.*;
public class Solution{
    public static void main(String[] args) throws Exception{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(reader.readLine());
        int b=Integer.parseInt(reader.readLine());
        int c=Integer.parseInt(reader.readLine());
        if(a+b>c&&b+c>a&&a+c>b) System.out.println("Треугольник существует.");
        else System.out.println("Треугольник не существует.");
    }
}