package com.javarush.task.task19.task1918;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Знакомство с тегами

Считайте с консоли имя файла, который имеет HTML-формат.

Пример:
Info about Leela <span xml:lang="en" lang="en"><b><span>Turanga Leela
</span></b></span><span>Super</span><span>girl</span>

Первым параметром в метод main приходит тег. Например, "span".
Вывести на консоль все теги, которые соответствуют заданному тегу.
Каждый тег на новой строке, порядок должен соответствовать порядку следования в файле.
Количество пробелов, n, r не влияют на результат.
Файл не содержит тег CDATA, для всех открывающих тегов имеется отдельный закрывающий тег, одиночных тегов нет.
Тег может содержать вложенные теги.

Пример вывода:
<span xml:lang="en" lang="en"><b><span>Turanga Leela</span></b></span>
<span>Turanga Leela</span>
<span>Super</span>
<span>girl</span>

Шаблон тега:
<tag>text1</tag>
<tag text2>text1</tag>
<tag
text2>text1</tag>

text1, text2 могут быть пустыми

Требования:
1. Программа должна считывать имя файла с консоли (используй BufferedReader).
2. BufferedReader для считывания данных с консоли должен быть закрыт.
3. Программа должна считывать содержимое файла (используй FileReader).
4. Поток чтения из файла (FileReader) должен быть закрыт.
5. Программа должна выводить в консоль все теги, которые соответствуют тегу, заданному в параметре метода main.

<span xml:lang="en" lang="en"><b>
	<span>
		Turanga Leela
	</span>
</b></span>
<span>
	Super
</span>
<span>
	girl
</span>
*/
public class Solution {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            try (BufferedReader fileReader = new BufferedReader(new FileReader(bufferedReader.readLine()))) {
                StringBuilder stringBuilder = new StringBuilder();
                while (fileReader.ready()) {
                    stringBuilder.append(fileReader.readLine());
                }
                findAndPrintTag(args[0], stringBuilder.toString(), 0);
            }
        } catch (IOException e) {
        }
    }

    public static void findAndPrintTag(String tag, String string, int startInd) {
        Pattern pattern = Pattern.compile("<" + tag + ".*?>.*?(<" + tag + ".*?>.*?</" + tag + ">.*?)*</" + tag + ">");
        Matcher matcher = pattern.matcher(string);
        matcher.region(startInd, string.length());
        while (matcher.find()) {
            System.out.println(matcher.group());
            findAndPrintTag(tag, matcher.group(), 1);
        }
    }
}