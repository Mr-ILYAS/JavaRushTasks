package com.javarush.task.task19.task1920;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
/*
Самый богатый

В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом.

Для каждого имени посчитать сумму всех его значений.
Вывести в консоль имена в алфавитном порядке, у которых максимальная сумма.
Имена разделять пробелом либо выводить с новой строки.
Закрыть потоки.

Пример входного файла:
Петров 0.501
Иванов 1.35
Петров 0.85

Пример вывода:
Петров

Требования:
1. Программа НЕ должна считывать данные с консоли.
2. Программа должна считывать содержимое файла (используй FileReader).
3. Поток чтения из файла (FileReader) должен быть закрыт.
4. Программа должна выводить в консоль имена, у которых максимальная сумма.
*/
public class Solution{
	public static void main(String[] args){
		TreeMap<String,Double> map=new TreeMap<>();
		String[] data={"", "0"};
		try(BufferedReader reader=new BufferedReader(new FileReader(args[0]))){
			while(reader.ready()){
				data=reader.readLine().split(" ", 2);
				if(map.containsKey(data[0])){
					data[1]=String.valueOf(Double.parseDouble(data[1])+map.get(data[0]));
					map.remove(data[0]);
				}
				map.put(data[0], Double.parseDouble(data[1]));
			}
		}catch(IOException e){}
		String name=null;
		double d=map.get(data[0]);
		for(Map.Entry<String,Double> pair : map.entrySet()){
			if(pair.getValue()>d){
				name=pair.getKey();
				d=pair.getValue();
			}
		}
		for(Map.Entry<String,Double> pair : map.entrySet()) if(pair.getValue()==d) System.out.println(pair.getKey());
	}
}