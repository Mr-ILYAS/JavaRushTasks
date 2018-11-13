package com.javarush.task.task07.task0708;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
/* 
Самая длинная строка

1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.

Требования:
1. Инициализируй поле класса новым ArrayList<>
2. Программа должна считывать 5 строк с клавиатуры и записывать их в список strings.
3. Программа должна выводить самую длинную строку на экран.
4. Если есть несколько строк с длиной равной максимальной, то нужно вывести каждую из них с новой строки.
*/
public class Solution{
    private static List<String> strings;
    public static void main(String[] args) throws Exception{
        strings=new ArrayList<>();
        int max=0;
	    String s;
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		strings.add(reader.readLine());
		for(int i=1;i<5;i++){
		    strings.add(s=reader.readLine());
		    if(strings.get(max).length()<s.length())max=i;
		}
        for(String ss:strings)if(ss.length()==strings.get(max).length())System.out.println(ss);
    }
}