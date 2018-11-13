package com.javarush.task.task18.task1812;
import java.io.*;
/*
Расширяем AmigoOutputStream

Используя шаблон проектирования Wrapper (Decorator) расширь функциональность AmigoOutputStream.
В классе QuestionFileOutputStream при вызове метода close() должна быть реализована следующая функциональность:
1. Вывести в консоль фразу "Вы действительно хотите закрыть поток? Д/Н".
2. Считайте строку.
3. Если считанная строка равна "Д", то закрыть поток.
4. Если считанная строка не равна "Д", то не закрывать поток.


Требования:
1. Интерфейс AmigoOutputStream изменять нельзя.
2. Класс QuestionFileOutputStream должен реализовывать интерфейс AmigoOutputStream.
3. Класс QuestionFileOutputStream должен инициализировать в конструкторе поле типа AmigoOutputStream.
4. Все методы QuestionFileOutputStream должны делегировать свое выполнение объекту AmigoOutputStream.
5. Метод close() должен спрашивать у пользователя "Вы действительно хотите закрыть поток? Д/Н".
6. Метод close() должен закрывать поток только в случае, если считает с консоли ответ "Д".
*/
public class QuestionFileOutputStream implements AmigoOutputStream{
	AmigoOutputStream aos;
	public QuestionFileOutputStream(AmigoOutputStream aos){
		this.aos=aos;
	}
	@Override
	public void flush() throws IOException{
		aos.flush();
	}
	@Override
	public void write(int b) throws IOException{
		aos.write(b);
	}
	@Override
	public void write(byte[] b) throws IOException{
		aos.write(b);
	}
	@Override
	public void write(byte[] b,int off,int len) throws IOException{
		aos.write(b,off,len);
	}
	@Override
	public void close() throws IOException{
		System.out.println("Вы действительно хотите закрыть поток? Д/Н");
		if("Д".equals(new BufferedReader(new InputStreamReader(System.in)).readLine()))aos.close();
	}
}