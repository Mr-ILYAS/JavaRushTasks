package com.javarush.task.task31.task3113;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* 
Что внутри папки?

Напиши программу, которая будет считать подробную информацию о папке и выводить ее на консоль.

Первым делом считай путь к папке с консоли.
Если введенный путь не является директорией - выведи "[полный путь] - не папка" и заверши работу.
Затем посчитай и выведи следующую информацию:

Всего папок - [количество папок в директории и поддиректориях]
Всего файлов - [количество файлов в директории и поддиректориях]
Общий размер - [общее количество байт, которое хранится в директории]

Используй только классы и методы из пакета java.nio.

Квадратные скобки [ ] выводить на экран не нужно.

Требования:
1. Метод main должен считывать путь к папке с консоли.
2. Если введенный путь не является директорией - нужно вывести "[полный путь] - не папка" и завершить работу.
3. Используй только классы и методы из пакета java.nio.
4. На консоль должна быть выведена следующая информация: "Всего папок - [количество папок в директории и поддиректориях]".
5. На консоль должна быть выведена следующая информация: "Всего файлов - [количество файлов в директории и поддиректориях]".
6. На консоль должна быть выведена следующая информация: "Общий размер - [общее количество байт, которое хранится в директории]".
*/
public class Solution{
    public static void main(String[] args) throws IOException{
        Path path = Paths.get(new BufferedReader(new InputStreamReader(System.in)).readLine());
        if (Files.isRegularFile(path))
            System.out.println(path+" - не папка");
        else{
            AtomicInteger files = new AtomicInteger();
            AtomicInteger folders = new AtomicInteger();
            AtomicLong size = new AtomicLong();
            folders.decrementAndGet();
            Files.walk(path)
                    .forEach(next_path -> {
                        if (Files.isRegularFile(next_path)){
                            files.incrementAndGet();
                            try{
                                size.addAndGet(Files.size(next_path));
                            }catch (IOException e){
                            }
                        }else folders.incrementAndGet();
                    });
            System.out.println("Всего папок - "+folders
                    +"\nВсего файлов - "+files
                    +"\nОбщий размер - "+size);
        }
    }
}