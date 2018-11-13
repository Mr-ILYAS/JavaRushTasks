package com.javarush.task.task19.task1916;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
/*
Отслеживаем изменения

Считать с консоли 2 имени файла - file1, file2.
Файлы содержат строки, file2 является обновленной версией file1, часть строк совпадают.
Нужно создать объединенную версию строк, записать их в список lines.
Операции ADDED и REMOVED не могут идти подряд, они всегда разделены SAME.
В оригинальном и редактируемом файлах пустых строк нет.

Пример содержимого по факту:
оригинальный    редактированный    общий
file1:			file2:			результат:(lines)

строка1		строка1			SAME строка1
строка2		строка3			REMOVED строка2
строка3		строка5			SAME строка3
строка4		строка0			REMOVED строка4
строка5		строка1			SAME строка5
строка1		строка3			ADDED строка0
строка2		строка5			SAME строка1
строка3		строка4			REMOVED строка2
строка4					SAME строка3
строка5					ADDED строка5
						SAME строка4
						REMOVED строка5

Требования:
1. Класс Solution должен содержать класс LineItem.
2. Класс Solution должен содержать enum Type.
3. Класс Solution должен содержать публичное статическое поле lines типа List, которое сразу проинициализировано.
4. В методе main(String[] args) программа должна считывать имена файлов с консоли (используй BufferedReader).
5. В методе main(String[] args) BufferedReader для считывания данных с консоли должен быть закрыт.
6. Программа должна считывать содержимое первого и второго файла (используй FileReader).
7. Потоки чтения из файлов (FileReader) должны быть закрыты.
8. Список lines должен содержать объединенную версию строк из файлов,
	где для каждой строки указана одна из операций ADDED, REMOVED, SAME.

Пример для представления:
оригинальный    редактированный    общий
file1:			file2:			результат:(lines)

строка1		строка1			SAME строка1
строка2					REMOVED строка2
строка3		строка3			SAME строка3
строка4					REMOVED строка4
строка5		строка5			SAME строка5
			строка0			ADDED строка0
строка1		строка1			SAME строка1
строка2					REMOVED строка2
строка3		строка3			SAME строка3
			строка5			ADDED строка5
строка4		строка4			SAME строка4
строка5					REMOVED строка5
*/
public class Solution{
	public static List<LineItem> lines=new ArrayList<>();
	public static void main(String[] args) throws IOException{
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String file1=reader.readLine();
		String file2=reader.readLine();
		reader.close();
		BufferedReader reader1=new BufferedReader(new FileReader(file1));
		BufferedReader reader2=new BufferedReader(new FileReader(file2));
		while(true){
			if(reader1.ready()){
				if(reader2.ready()){
					reader1.mark(500);
					reader2.mark(500);
					file1=reader1.readLine();
					file2=reader2.readLine();
					if(file2.equals(file1)) lines.add(new LineItem(Type.SAME,file1));
					else{
						if(file1.equals(reader2.readLine())){
							reader1.reset();
							reader2.reset();
							lines.add(new LineItem(Type.ADDED,reader2.readLine()));
						}else{
							lines.add(new LineItem(Type.REMOVED,file1));
							reader2.reset();
						}
					}
				}else lines.add(new LineItem(Type.REMOVED,reader1.readLine()));
			}else{
				if(reader2.ready()) lines.add(new LineItem(Type.ADDED,reader2.readLine()));
				else break;
			}
		}
		reader1.close();
		reader2.close();
		for(LineItem l : lines)System.out.println(l.type+" "+l.line);
	}
	public static enum Type{
		ADDED,        //добавлена новая строка
		REMOVED,      //удалена строка
		SAME          //без изменений
	}
	public static class LineItem{
		public Type type;
		public String line;
		public LineItem(Type type,String line){
			this.type=type;
			this.line=line;
		}
	}
}
