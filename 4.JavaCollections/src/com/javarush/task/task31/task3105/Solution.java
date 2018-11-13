package com.javarush.task.task31.task3105;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/* 
Добавление файла в архив

В метод main приходит список аргументов.
Первый аргумент - полный путь к файлу fileName.
Второй аргумент - путь к zip-архиву.
Добавить файл (fileName) внутрь архива в директорию 'new'.
Если в архиве есть файл с таким именем, то заменить его.

Пример входных данных:
C:/result.mp3
C:/pathToTest/test.zip

Файлы внутри test.zip:
a.txt
b.txt

После запуска Solution.main архив test.zip должен иметь такое содержимое:
new/result.mp3
a.txt
b.txt

Подсказка: нужно сначала куда-то сохранить содержимое всех энтри, а потом записать в архив все энтри вместе с добавленным файлом.
Пользоваться файловой системой нельзя.

Требования:
1. В методе main создай ZipInputStream для архивного файла (второй аргумент main). Нужно вычитать из него все содержимое.
2. В методе main создай ZipOutputStream для архивного файла (второй аргумент main).
3. В ZipOutputStream нужно записать содержимое файла, который приходит первым аргументом в main.
4. В ZipOutputStream нужно записать все остальное содержимое, которое было вычитано из ZipInputStream.
5. Потоки для работы с архивом должны быть закрыты.
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        args[0] = "new/" + new File(args[0]).getName();
        ZipInputStream zis = new ZipInputStream(new FileInputStream(args[1]));
        HashMap<ZipEntry,byte[]> entrys=new HashMap<>();
        ZipEntry ze;
        byte[] buffer = new byte[zis.available()];
        while ((ze = zis.getNextEntry()) != null) {
            if (ze.getName().equals(args[0])) {
                continue;
            }
            zis.read(buffer);
            entrys.put(ze,buffer);
            zis.closeEntry();
        }
        zis.close();
        try (ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(args[1]))) {
            for (HashMap.Entry<ZipEntry,byte[]> pair: entrys.entrySet()) {
                zos.putNextEntry(pair.getKey());
                zos.write(pair.getValue());
                zos.closeEntry();
            }
            ZipEntry entry = new ZipEntry(args[0]);
            zos.putNextEntry(entry);
            zos.write(buffer);
            zos.closeEntry();
        }
    }
}