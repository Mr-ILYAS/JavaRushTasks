package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Количество букв

Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 33 маленьких букв алфавита).
Результат вывести на экран в алфавитном порядке.

Пример вывода:
а 5
б 8
в 3
г 7
д 0
…
я 9

Требования:
1. Программа должна считывать данные с клавиатуры.
2. Программа должна выводить текст на экран.
3. Выведенный текст должен содержать 33 строки.
4. Каждая строка вывода должна содержать букву русского алфавита, пробел и сколько раз буква встречалась в введенных строках.
*/
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();
        ArrayList<Character> alphabet = new ArrayList<>();
        for (int i = 0; i < abcArray.length; i++)
            alphabet.add(abcArray[i]);
        StringBuilder sb = new StringBuilder();
        String s;
        for (int i = 0; i < 10; i++)
            sb.append(reader.readLine().toLowerCase());
        s = sb.toString();
        for (char c : alphabet)
            System.out.println(c + " " + ((s + "\0").split(String.valueOf(c)).length - 1));
    }
}