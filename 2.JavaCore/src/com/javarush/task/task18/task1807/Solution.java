package com.javarush.task.task18.task1807;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
/*
Подсчет запятых

С консоли считать имя файла.
Посчитать в файле количество символов ',', количество вывести на консоль.
Закрыть потоки.

Подсказка:
нужно сравнивать с ascii-кодом символа ','.

Требования:
1. Программа должна считывать имя файла с консоли.
2. Для чтения из файла используй поток FileInputStream.
3. В консоль должно выводится число запятых в считанном файле.
4. Поток чтения из файла должен быть закрыт.
*/
public class Solution{
	public static void main(String[] args) throws IOException{
		FileInputStream inputStream=new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
		long[] arr=new long[256];
		while(inputStream.available()>0)arr[inputStream.read()]++;
		inputStream.close();
		System.out.println(arr[',']);
	}
}