package com.javarush.task.task08.task0817;
import java.util.HashMap;
/*
Нам повторы не нужны

Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» — «имя».
Удалить людей, имеющих одинаковые имена.

Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Класс Solution должен содержать только четыре метода.
4. Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, String состоящих из 10 записей.
5. Метод removeTheFirstNameDuplicates() должен удалять из словаря всех людей, имеющие одинаковые имена.
6. Метод removeTheFirstNameDuplicates() должен вызывать метод removeItemFromMapByValue().
*/
public class Solution{
    public static HashMap<String,String> createMap(){
        HashMap<String,String> adressBook=new HashMap<>();
        adressBook.put("a","q");
        adressBook.put("s","w");
        adressBook.put("d","e");
        adressBook.put("f","r");
        adressBook.put("g","t");
        adressBook.put("h","y");
        adressBook.put("j","u");
        adressBook.put("k","i");
        adressBook.put("l","o");
        adressBook.put("ж","з");
        return adressBook;
    }
public static void removeTheFirstNameDuplicates(HashMap<String,String> map){
    HashMap<String,String> copy=new HashMap<>(map);
    HashMap<String,String> del=new HashMap<>(map);
    for(HashMap.Entry<String,String> pair:copy.entrySet()){
        del.remove(pair.getKey());
        if(del.containsValue(pair.getValue()))removeItemFromMapByValue(map,pair.getValue());
    }
}
public static void removeItemFromMapByValue(HashMap<String,String> map,String value){
    HashMap<String,String> copy=new HashMap<>(map);
    for(HashMap.Entry<String,String> pair : copy.entrySet()){
        if(pair.getValue().equals(value)) map.remove(pair.getKey());
    }
}
    public static void main(String[] args){}
}