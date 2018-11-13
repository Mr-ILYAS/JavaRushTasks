package com.javarush.task.task19.task1919;
import java.io.*;
import java.util.Map;
import java.util.TreeMap;
/*
Считаем зарплаты

В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом.

Для каждого имени посчитать сумму всех его значений.
Все данные вывести в консоль, предварительно отсортировав в возрастающем порядке по имени.
Закрыть потоки.

Пример входного файла:
Петров 2
Сидоров 6
Иванов 1.35
Петров 3.1

Пример вывода:
Иванов 1.35
Петров 5.1
Сидоров 6.0

Требования:
1. Программа НЕ должна считывать данные с консоли.
2. Программа должна считывать содержимое файла (используй FileReader).
3. Поток чтения из файла (FileReader) должен быть закрыт.
4. Программа должна выводить в консоль каждое имя и сумму всех его значений,
	все данные должны быть отсортированы в возрастающем порядке по имени.
*/
public class Solution{
	public static void main(String[] args){
		TreeMap<String,Double> map=new TreeMap<>();
		try(BufferedReader reader=new BufferedReader(new FileReader(args[0]))){
			String[] pair;
			while(reader.ready()){
				pair=reader.readLine().split(" ",2);
				if(map.containsKey(pair[0])){
					pair[1]=String.valueOf(Double.parseDouble(pair[1])+map.get(pair[0]));
					map.remove(pair[0]);
				}
				map.put(pair[0],Double.parseDouble(pair[1]));
			}
		}catch(IOException e){}
		for(Map.Entry<String,Double> pair:map.entrySet())System.out.println(pair.getKey()+" "+pair.getValue());
	}
}
