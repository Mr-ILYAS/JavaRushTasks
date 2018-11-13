package com.javarush.task.task22.task2210;

import java.util.Collections;
import java.util.StringTokenizer;

/*
StringTokenizer

Используя StringTokenizer разделить query на части по разделителю delimiter.

Пример
getTokens("level22.lesson13.task01", ".")

возвращает массив строк
{"level22", "lesson13", "task01"}

Требования:
1. Метод getTokens должен использовать StringTokenizer.
2. Метод getTokens должен быть публичным.
3. Метод getTokens должен принимать два параметра типа String.
4. Массив типа String возвращенный методом getTokens должен быть заполнен правильно(согласно условию задачи).
*/
public class Solution {
    public static void main(String[] args) {
        for (String s : getTokens("level22.lesson13.task01", ".1")) System.out.println(s);
    }

    public static String[] getTokens(String query, String delimiter) {
        return Collections.list(new StringTokenizer(query, delimiter)).toArray(new String[0]);
    }
}