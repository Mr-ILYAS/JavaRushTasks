package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Самые-самые

1. Создай список строк.
2. Добавь в него 10 строчек с клавиатуры.
3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
Если таких строк несколько, то должны быть учтены самые первые из них.
4. Выведи на экран строку из п.3.

Требования:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Программа должна считывать 10 строк с клавиатуры и добавлять их в список.
3. Программа должна выводить на экран самую короткую строку, если она была раньше самой длинной.
4. Программа должна выводить на экран самую длинную строку, если она была раньше самой короткой.
*/
public class Solution{
    public static void main(String[] args) throws Exception{
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int size = 0;
        for (int i = 0, len, numMax = 0, numMin = 0; i < 10; i++){
            list.add(reader.readLine());
            len = list.get(i).length();
            if (size < len){
                size = len;
                numMax = i;
            }
            if (len < list.get(numMin).length())
                numMin = i;
            if (i == 9)
                size = numMax > numMin ? numMin : numMax;
        }
        System.out.println(list.get(size));
    }
}