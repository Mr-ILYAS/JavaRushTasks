package com.javarush.task.task03.task0303;
/*
Обмен валют

Реализуй метод convertEurToUsd, переводящий евро в доллары по заданному курсу.
Вызови его дважды в методе main с любыми параметрами.
Результаты выведи на экран, каждый раз с новой строки.

Подсказка:
Расчет выполняется по формуле: долларСША = евро * курс


Требования:
1. Метод convertEurToUsd должен умножать евро на курс и возвращать полученный результат.
2. Метод main должен 2 раза вызвать метод convertEurToUsd с любыми параметрами.
3. Метод main должен выводить результаты вызовов на экран, каждый раз с новой строки.
4. Метод convertEurToUsd не должен ничего выводить на экран.
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(10,70));
        System.out.println(convertEurToUsd(3,6.70));
    }
    public static double convertEurToUsd(int eur, double course) {
        return eur*course;
    }
}