package com.javarush.task.task22.task2207;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

/* 
Обращенные слова

В методе main с консоли считать имя файла, который содержит слова, разделенные пробелами.
Найти в тексте все пары слов, которые являются обращением друг друга. Добавить их в result.
Использовать StringBuilder.
Кодировка файла - UTF-8.

Пример содержимого файла
рот тор торт о
о тот тот тот

Вывод:
рот тор
о о
тот тот

Требования:
1. Метод main должен считывать имя файла с клавиатуры.
2. В методе main должен быть использован StringBuilder.
3. В классе Solution должен содержаться вложенный класс Pair.
4. В классе Pair должен быть объявлен конструктор без параметров (или конструктор по умолчанию).
5. Список result должен быть заполнен корректными парами согласно условию задачи.
*/
public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s;
        try (BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()))) {
            reader.close();
            while ((s = fileReader.readLine()) != null) {
                sb.append(s).append(" ");
            }
        }
        String[] arr = sb.toString().trim().split("\\s+");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                sb.setLength(0);
                s=sb.append(arr[j]).reverse().toString();
                if (s.equals(arr[i])) {
                    Pair pair = new Pair();
                    pair.first = s;
                    pair.second = arr[j];
                    result.add(pair);
                    arr[i]=null;
                    arr[j]=null;
                    break;
                }
            }
        }
    }

    public static class Pair {
        String first;
        String second;

        public Pair() {
        }

        private Pair(String first, String second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;
            if(first==null||second==null||pair.first==null||pair.second==null)return false;
            if(!first.equals(pair.first)) return false;// second.equals(pair.first) && first.equals(pair.second);
            if(!second.equals(pair.second))return false;//second.equals(pair.first) && first.equals(pair.second);
            return true;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * (result + (second != null ? second.hashCode() : 0));
            return result;
        }

        @Override
        public String toString() {
            return  first == null && second == null ? "" :
                    first == null && second != null ? second :
                            second == null && first != null ? first :
                                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }
}