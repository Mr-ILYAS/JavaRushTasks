package com.javarush.task.task18.task1802;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
/*
Минимальный байт

Ввести с консоли имя файла.
Найти минимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода.

Требования:
1. Программа должна считывать имя файла с консоли.
2. Для чтения из файла используй поток FileInputStream.
3. В консоль должен выводиться минимальный байт, считанный из файла.
4. Поток чтения из файла должен быть закрыт.
*/
public class Solution{
	public static void main(String[] args) throws Exception{
		FileInputStream inputStream=new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
		int min=0,i;
		if(inputStream.available()>0)min=inputStream.read();
		while(inputStream.available()>0)if((i=inputStream.read())<min)min=i;
		inputStream.close();
		System.out.println(min);
	}
}