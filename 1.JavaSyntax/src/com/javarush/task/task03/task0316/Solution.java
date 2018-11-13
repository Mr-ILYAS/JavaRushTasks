package com.javarush.task.task03.task0316;
/*
Экранирование символов

Про экранирование символов в Java читай в дополнительном материале к лекции.

Вывести на экран следующий текст — две строки:
It's Windows path: "C:\Program Files\Java\jdk1.7.0\bin"
It's Java string: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"

Требования:
1. Программа должна выводить текст.
2. Должно быть выведено две строки.
3. Текст первый строки должен быть: It's Windows path: "C:\Program Files\Java\jdk1.7.0\bin"
4. Текст второй строки должен быть: It's Java string: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"
*/
public class Solution{
    public static void main(String[] args){
        System.out.println("It's Windows path: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"");
        System.out.println("It's Java string: \\\"C:\\\\Program Files\\\\Java\\\\jdk1.7.0\\\\bin\\\"");
    }
}