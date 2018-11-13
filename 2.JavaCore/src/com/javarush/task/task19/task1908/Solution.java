package com.javarush.task.task19.task1908;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
Выделяем числа

Считать с консоли 2 имени файла.
Вывести во второй файл все числа, которые есть в первом файле.
Числа выводить через пробел.
Закрыть потоки.

Пример тела файла:
12 text var2 14 8v 1

Результат:
12 14 1

Требования:
1. Программа должна считывать имена файлов с консоли (используй BufferedReader).
2. BufferedReader для считывания данных с консоли должен быть закрыт.
3. Программа должна считывать содержимое первого файла (используй BufferedReader c конструктором FileReader).
4. Поток чтения из файла (BufferedReader) должен быть закрыт.
5. Программа должна записывать во второй файл все числа, через пробел, из первого файла (используй BufferedWriter с конструктором FileWriter).
6. Поток записи в файл (BufferedWriter) должен быть закрыт.
*/
public class Solution{
	public static void main(String[] args) throws IOException{
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		BufferedReader fileReader=new BufferedReader(new FileReader(reader.readLine()));
		BufferedWriter writer=new BufferedWriter(new FileWriter(reader.readLine()));
		reader.close();
		Pattern p=Pattern.compile("\\b\\d+\\b");
		Matcher m;
		while(fileReader.ready()){
			m=p.matcher(fileReader.readLine());
			while(m.find())
				writer.write(m.group()+" ");
		}
		writer.close();
		fileReader.close();
	}
}