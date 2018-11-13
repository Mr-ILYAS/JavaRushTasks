package com.javarush.task.task08.task0818;
import java.util.HashMap;
/*
Только для богачей

Создать словарь (Map<String, Integer>) и занести в него десять записей по принципу: «фамилия» — «зарплата».
Удалить из словаря всех людей, у которых зарплата ниже 500.

Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Класс Solution должен содержать только три метода.
4. Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, Integer состоящих из 10 записей по принципу «фамилия» - «зарплата».
5. Метод removeItemFromMap() должен удалять из словаря всех людей, у которых зарплата ниже 500.
*/
public class Solution{
    public static HashMap<String,Integer> createMap(){
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i++<10;map.put("lastname"+i,i*100));
        return map;
    }
    public static void removeItemFromMap(HashMap<String,Integer> map){
        HashMap<String,Integer> mapCopy=new HashMap<>(map);
        for(HashMap.Entry<String,Integer> pair:mapCopy.entrySet())if((pair.getValue()<500))map.remove(pair.getKey());
    }
    public static void main(String[] args){}
}