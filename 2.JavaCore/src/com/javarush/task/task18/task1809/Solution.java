package com.javarush.task.task18.task1809;
import java.io.*;
/*
Реверс файла

Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке.
Закрыть потоки.

Требования:
1. Программа должна два раза считать имена файлов с консоли.
2. Для чтения из файла используй поток FileInputStream, для записи в файл - FileOutputStream
3. Во второй файл нужно записать все байты из первого в обратном порядке.
4. Потоки FileInputStream и FileOutputStream должны быть закрыты.
*/
public class Solution{
	public static void main(String[] args) throws IOException{
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		FileInputStream inputStream=new FileInputStream(reader.readLine());
		FileOutputStream outputStream=new FileOutputStream(reader.readLine());
		byte[] buffer=new byte[inputStream.available()];
		inputStream.read(buffer);
		inputStream.close();
		for(int i=buffer.length-1;i>-1;outputStream.write(buffer[i--]))
		outputStream.close();
	}
}