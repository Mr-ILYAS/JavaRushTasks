package com.javarush.task.task19.task1925;

import java.io.*;

/*
Длинные слова

В метод main первым параметром приходит имя файла1, вторым - файла2.
Файл1 содержит слова, разделенные пробелом.
Записать через запятую в Файл2 слова, длина которых строго больше 6.
В конце файла2 запятой не должно быть.
Закрыть потоки.

Пример выходных данных в файл2:
длинное,короткое,аббревиатура

Требования:
1. Программа НЕ должна считывать данные с консоли.
2. Программа должна считывать содержимое первого файла (используй FileReader c конструктором String).
3. Поток чтения из файла (FileReader) должен быть закрыт.
4. Программа должна записывать через запятую во второй файл все слова из первого файла длина которых строго больше 6(используй FileWriter).
5. Поток записи в файл (FileWriter) должен быть закрыт.
*/
public class Solution{
	public static void main(String[] args) throws IOException{
		BufferedReader fileReader=new BufferedReader(new FileReader(args[0]));
		BufferedWriter fileWriter=new BufferedWriter(new FileWriter(args[1]));
		StringBuilder sb=new StringBuilder();

		while(fileReader.ready()) {
			sb.append(fileReader.readLine()).append(" ");
		}
		fileReader.close();

		String content=sb.toString();
		sb.setLength(0);
		for(String s : content.split(" +")) {
			if (s.length() > 6) {
				sb.append(s).append(",");
			}
		}

		sb.setLength(sb.length()-1);
		fileWriter.write(sb.toString());
		fileWriter.close();
	}
}