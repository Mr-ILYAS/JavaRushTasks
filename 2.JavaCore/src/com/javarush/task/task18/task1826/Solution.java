package com.javarush.task.task18.task1826;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/*
Шифровка

Придумать механизм шифровки/дешифровки.

Программа запускается с одним из следующих наборов параметров:
-e fileName fileOutputName
-d fileName fileOutputName

где:
fileName - имя файла, который необходимо зашифровать/расшифровать.
fileOutputName - имя файла, куда необходимо записать результат шифрования/дешифрования.
-e - ключ указывает, что необходимо зашифровать данные.
-d - ключ указывает, что необходимо расшифровать данные.

Требования:
1. Считывать с консоли ничего не нужно.
2. Создай поток для чтения из файла, который приходит вторым параметром ([fileName]).
3. Создай поток для записи в файл, который приходит третьим параметром ([fileOutputName]).
4. В режиме "-e" программа должна зашифровать [fileName] и записать в [fileOutputName].
5. В режиме "-d" программа должна расшифровать [fileName] и записать в [fileOutputName].
6. Созданные для файлов потоки должны быть закрыты.
*/
public class Solution{
	public static void main(String[] args) throws IOException{
		FileInputStream fileInputStream=new FileInputStream(args[1]);
		FileOutputStream fileOutputStream=new FileOutputStream(args[2]);
		byte[] buff=new byte[fileInputStream.available()];
		fileInputStream.read(buff);
		if("-e".equals(args[0])){
			for(int i=buff.length-1;i>-1;i--){
				if(buff[i]==255)buff[i]=0;
				else buff[i]++;
			}
		}else if("-d".equals(args[0])){
			for(int i=buff.length-1;i>-1;i--){
				if(buff[i]==0)buff[i]=(byte)255;
				else buff[i]--;
			}
		}
		fileOutputStream.write(buff);
		fileInputStream.close();
		fileOutputStream.close();
	}
}