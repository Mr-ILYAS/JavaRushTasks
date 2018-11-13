package com.javarush.task.task22.task2211;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

/* 
Смена кодировки

В метод main первым параметром приходит имя файла, тело которого в кодировке Windows-1251.
В метод main вторым параметром приходит имя файла, в который необходимо записать содержимое первого файла в кодировке UTF-8.


Требования:
1. Программа НЕ должна считывать данные с клавиатуры.
2. Программа НЕ должна выводить данные на экран.
3. Программа должна записывать данные в файл.
4. Содержимое второго файла должно соответствовать содержимому первого файла за исключением кодировки(UTF-8).
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(args[1]),Charset.forName("UTF-8"))) {
            Files.readAllLines(Paths.get(args[0]), Charset.forName("Windows-1251")).forEach(s -> {
                try {
                    writer.write(s);
                } catch (IOException e) {}
            });
        }
    }
}