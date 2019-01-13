package com.javarush.task.task18.task1819;
import java.io.*;
/*
Объединение файлов

Считать с консоли 2 имени файла.
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов.
Закрыть потоки.

Требования:
1. Программа должна два раза считать имена файлов с консоли.
2. Для первого файла создай поток для чтения и считай его содержимое.
3. Затем, для первого файла создай поток для записи. Для второго - для чтения.
4. Содержимое первого и второго файла нужно объединить в первом файле.
5. Сначала должно идти содержимое второго файла, затем содержимое первого.
6. Созданные для файлов потоки должны быть закрыты.
*/
public class Solution{
	public static void main(String[] args) throws IOException{
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String f1=reader.readLine();
		String f2=reader.readLine();
		FileInputStream inputStream1=new FileInputStream(f1);
		FileInputStream inputStream2=new FileInputStream(f2);

		byte[] dataf1=new byte[inputStream1.available()];
		byte[] dataf2=new byte[inputStream2.available()];

		if(inputStream1.available()>0)inputStream1.read(dataf1);
		if(inputStream2.available()>0)inputStream2.read(dataf2);

		OutputStream outputStream=new FileOutputStream(f1);

		outputStream.write(dataf2);
		outputStream.write(dataf1);

		inputStream1.close();
		inputStream2.close();
		outputStream.close();
	}
}