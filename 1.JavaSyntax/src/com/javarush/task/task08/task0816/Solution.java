package com.javarush.task.task08.task0816;

import java.util.Date;
import java.util.HashMap;

/*
Добрая Зинаида и летние каникулы

Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» — «дата рождения».
Удалить из словаря всех людей, родившихся летом.

Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, Date состоящий из 10 записей.
4. Метод removeAllSummerPeople() должен удалять из словаря всех людей, родившихся летом.
*/
public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<>();
        for (int i = 0; i++ < 10; map.put("lastname" + i, new Date("JUNE 1 1980"))) ;
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        HashMap<String, Date> mapCopy = new HashMap<>(map);
        for (HashMap.Entry<String, Date> pair : mapCopy.entrySet()) {
            if ((pair.getValue().getMonth() > 4) && (pair.getValue().getMonth() < 8))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
    }
}