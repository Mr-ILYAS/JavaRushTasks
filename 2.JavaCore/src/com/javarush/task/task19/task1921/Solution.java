package com.javarush.task.task19.task1921;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/*
Хуан Хуанович

В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя день месяц год
где [имя] - может состоять из нескольких слов, разделенных пробелами, и имеет тип String.
[день] - int, [месяц] - int, [год] - int
данные разделены пробелами.

Заполнить список PEOPLE используя данные из файла.
Закрыть потоки.

Пример входного файла:
Иванов Иван Иванович 31 12 1987
Вася 15 5 2013


Требования:
1. Класс Solution должен содержать публичную константу PEOPLE типа List, которая должна быть сразу проинициализирована.
2. Программа НЕ должна считывать данные с консоли.
3. Программа должна считывать содержимое файла (используй FileReader).
4. Поток чтения из файла (FileReader) должен быть закрыт.
5. Программа должна заполнить список PEOPLE данными из файла.
6. Программа должна правильно работать с двойными именами, например Анна-Надежда.
*/
public class Solution{
	public static final List<Person> PEOPLE=new ArrayList<>();
	public static void main(String[] args){
		try(BufferedReader reader=new BufferedReader(new FileReader(args[0]))){
			StringBuilder name=new StringBuilder();
			while(reader.ready()){
				String[] line=reader.readLine().split("& ");
				for(int i=0,j=line.length-3; i<j;name.append(line[i++]).append(" "));
				name.setLength(name.length()-1);
				PEOPLE.add(new Person(name.toString(),new Date(Integer.parseInt(line[line.length-1])-1900,Integer.parseInt(line[line.length-2])-1,Integer.parseInt(line[line.length-3]))));
				name.setLength(0);
			}
		}catch(IOException e){}
	}
}