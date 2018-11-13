package com.javarush.task.task08.task0802;
/*
HashMap из 10 пар

Создать коллекцию HashMap<String, String>, занести туда 10 пар строк:
арбуз — ягода,
банан — трава,
вишня — ягода,
груша — фрукт,
дыня — овощ,
ежевика — куст,
жень-шень — корень,
земляника — ягода,
ирис — цветок,
картофель — клубень.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.

Пример вывода (тут показана только одна строка):
картофель - клубень

Требования:
1. Объяви переменную коллекции HashMap с типом элементов String, String и сразу проинициализируй ee.
2. Программа не должна считывать значения с клавиатуры.
3. Программа должна добавлять в коллекцию 10 пар строк, согласно условию.
4. Программа должна выводить содержимое коллекции на экран, каждую пару через дефис и с новой строки.
*/
import java.util.HashMap;
import java.util.Map;
public class Solution{
    public static void main(String[] args) throws Exception{
        HashMap<String,String> plants=new HashMap<>();
        plants.put("арбуз","ягода");
        plants.put("банан","трава");
        plants.put("вишня","ягода");
        plants.put("груша","фрукт");
        plants.put("дыня","овощ");
        plants.put("ежевика","куст");
        plants.put("жень-шень","корень");
        plants.put("земляника","ягода");
        plants.put("ирис","цветок");
        plants.put("картофель","клубень");
        for(Map.Entry<String,String> pair:plants.entrySet())System.out.println(pair.getKey()+" - "+pair.getValue());
    }
}