package com.javarush.task.task19.task1927;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
/*
Контекстная реклама

В методе main подмени объект System.out написанной тобой реадер-оберткой.
Твоя реадер-обертка должна выводить на консоль контекстную рекламу после каждого второго println-а.
Вызови готовый метод printSomething(), воспользуйся testString.
Верни переменной System.out первоначальный поток.

Рекламный текст: "JavaRush - курсы Java онлайн"

Пример вывода:
first
second
JavaRush - курсы Java онлайн
third
fourth
JavaRush - курсы Java онлайн
fifth

Требования:
1. Класс Solution должен содержать класс TestString.
2. Класс Solution должен содержать публичное статическое поле testString типа TestString, которое сразу проинициализировано.
3. Класс TestString должен содержать публичный void метод printSomething().
4. Метод printSomething() класса TestString должен выводить на экран строки: "first","second","third","fourth","fifth".
5. Метод main(String[] args) класса Solution должен создавать поток PrintStream
	(используй PrintStream c параметром конструктора ByteArrayOutputStream).
6. Метод main(String[] args) класса Solution должен подменять и восстанавливать поток вывода в консоль объекта System.out.
7. Метод main(String[] args) класса Solution должен вызывать метод printSomething(),объекта testString.
8. Метод main(String[] args) класса Solution должен модифицировать строки(вставлять контекстную рекламу)
	выведенные методом printSomething() согласно заданию, и выводить её в консоль.
*/
public class Solution{
	public static TestString testString=new TestString();
	public static void main(String[] args){
		PrintStream consoleStream=System.out;
		ByteArrayOutputStream outputStream=new ByteArrayOutputStream();
		PrintStream stream=new PrintStream(outputStream);
		System.setOut(stream);
		testString.printSomething();
		System.setOut(consoleStream);
		byte b=0;
		for(String s:outputStream.toString().split("\n")){
			System.out.println(s);
			if((b^=1)==0)System.out.println("JavaRush - курсы Java онлайн");
		}
	}
	public static class TestString{
		public void printSomething(){
			System.out.println("first");
			System.out.println("second");
			System.out.println("third");
			System.out.println("fourth");
			System.out.println("fifth");
		}
	}
}