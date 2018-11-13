package com.javarush.task.task13.task1319;
import java.io.*;
/*
Писатель в файл с консоли

1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой строки.

Требования:
1. Программа должна считывать c консоли имя файла.
2. Создай и используй объект типа BufferedWriter.
3. Программа не должна ничего читать из файловой системы.
4. Программа должна читывать строки с консоли, пока пользователь не введет строку "exit".
5. Программа должна записать абсолютно все введенные строки (включая "exit") в файл, каждую строчку с новой строки.
6. Метод main должен закрывать объект типа BufferedWriter после использования.
*/
public class Solution{
    public static void main(String[] args) throws IOException{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer=new BufferedWriter(new FileWriter(reader.readLine()));
        String s;
        for(s=reader.readLine();!s.equals("exit");writer.write((s=reader.readLine())+'\n'));
        writer.write(s);
        writer.close();
        reader.close();
    }
}