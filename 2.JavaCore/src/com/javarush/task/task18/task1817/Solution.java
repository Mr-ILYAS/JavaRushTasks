package com.javarush.task.task18.task1817;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/*
Пробелы

В метод main первым параметром приходит имя файла.
Вывести на экран соотношение количества пробелов к количеству всех символов. Например, 10.45.
1. Посчитать количество всех символов.
2. Посчитать количество пробелов.
3. Вывести на экран п2/п1*100, округлив до 2 знаков после запятой.
4. Закрыть потоки.

Требования:
1. Считывать с консоли ничего не нужно.
2. Создай поток чтения из файла, который приходит первым параметром в main.
3. Посчитай отношение пробелов ко всем символам в файле и выведи в консоль это число.
4. Выведенное значение необходимо округлить до 2 знаков после запятой.
5. Поток чтения из файла должен быть закрыт.
*/
public class Solution {
	public static void main(String[] args) throws IOException{
		BufferedReader reader=new BufferedReader(new FileReader(args[0]));
		StringBuilder sb=new StringBuilder();
		while(reader.ready())sb.append(reader.readLine());
		reader.close();
		System.out.printf("%.2f",(float)((sb+"\0").split(" ").length-1)/(float)sb.length()*100.0f);
	}
}