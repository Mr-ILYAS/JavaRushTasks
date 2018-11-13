package com.javarush.task.task01.task0133;
/*
Не думать о секундах…

Реализуй метод getCountSecondsPassedInCurrentHour(int seconds). Метод на вход принимает целое число секунд, которые прошли с начала текущих суток. Нужно найти количество секунд, прошедших с начала последнего часа, и вернуть это число.

Пример:
Метод getCountSecondsPassedInCurrentHour вызывается с параметром 12345.

Пример вывода:
1545

Требования:
1. Метод getCountSecondsPassedInCurrentHour(int) должен быть публичным и статическим.
2. Метод getCountSecondsPassedInCurrentHour должен возвращать значение типа int.
3. Метод getCountSecondsPassedInCurrentHour не должен ничего выводить на экран.
4. Метод getCountSecondsPassedInCurrentHour должен правильно возвращать количество секунд, прошедших с начала последнего часа.
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(getCountSecondsPassedInCurrentHour(12345));
    }
    public static int getCountSecondsPassedInCurrentHour(int seconds) {
        return seconds-(seconds/3600)*3600;
    }
}