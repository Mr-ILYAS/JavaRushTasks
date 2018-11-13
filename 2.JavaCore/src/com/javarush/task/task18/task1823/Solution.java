package com.javarush.task.task18.task1823;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
/*
Нити и байты

Читайте с консоли имена файлов, пока не будет введено слово "exit".
Передайте имя файла в нить ReadThread.
Нить ReadThread должна найти байт, который встречается в файле максимальное число раз, и добавить его в словарь resultMap,
где параметр String - это имя файла, параметр Integer - это искомый байт.
Закрыть потоки.

Требования:
1. Программа должна считывать имена файлов с консоли, пока не будет введено слово "exit".
2. Для каждого файла создай нить ReadThread и запусти ее.
3. После запуска каждая нить ReadThread должна создать свой поток для чтения из файла.
4. Затем, нити должны найти максимально встречающийся байт в своем файле и добавить его в словарь resultMap.
5. Поток для чтения из файла в каждой нити должен быть закрыт.
*/
public class Solution{
	public static Map<String,Integer> resultMap=new HashMap<>();
	public static void main(String[] args) throws IOException{
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		for(String s=reader.readLine();!"exit".equals(s);s=reader.readLine()) new ReadThread(s).start();
	}
	public static class ReadThread extends Thread{
		String fileName;
		public ReadThread(String fileName){
			this.fileName=fileName;
		}
		@Override
		public void run(){
			int[] arr=new int[257];
			try(FileInputStream inputStream=new FileInputStream(fileName)){
				while(inputStream.available()>0) arr[inputStream.read()]++;
				inputStream.close();
				for(int i=1,k=arr[0];i<256;i++) if(arr[i]>k) k=arr[arr[256]=i];
				synchronized(resultMap){ resultMap.put(fileName,arr[256]); }
			}catch(IOException e){}
		}
	}
}