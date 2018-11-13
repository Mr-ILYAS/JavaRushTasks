package com.javarush.task.task04.task0416;
/*
Переходим дорогу вслепую

Работа светофора для пешеходов запрограммирована следующим образом:
в начале каждого часа в течение трех минут горит зелёный сигнал,
затем в течение одной минуты — жёлтый,
а потом в течение одной минуты — красный,
затем опять зелёный горит три минуты и т. д.
Ввести с клавиатуры вещественное число t, означающее время в минутах, прошедшее с начала очередного часа.
Определить, сигнал какого цвета горит для пешеходов в этот момент.
Результат вывести на экран в следующем виде:
«зелёный» — если горит зелёный цвет,
«жёлтый» — если горит жёлтый цвет,
«красный» — если горит красный цвет.

Пример для числа 2.5:
зелёный

Пример для числа 3:
жёлтый

Пример для числа 4:
красный

Пример для числа 5:
зелёный


Требования:
1. Программа должна считывать вещественное число c клавиатуры.
2. Программа должна выводить текст на экран.
3. Если горит зелёный цвет, необходимо вывести текст: "зелёный"
4. Если горит жёлтый цвет, необходимо вывести текст: "жёлтый"
5. Если горит красный цвет, необходимо вывести текст: "красный"
*/
import java.io.*;
public class Solution{
    public static void main(String[] args) throws Exception{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        double t=Double.parseDouble(reader.readLine())%5.0D;
        if(t<3.0D) System.out.println("зелёный");
        else if(t<4.0D) System.out.println("жёлтый");
        else System.out.println("красный");
    }
}