package com.javarush.task.task04.task0441;
/*
Как-то средненько

Ввести с клавиатуры три числа, вывести на экран среднее из них.
Т.е. не самое большое и не самое маленькое.
Если все числа равны, вывести любое из них.

Требования:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить число на экран.
3. Программа должна выводить среднее из трех чисел.
4. Если все числа равны, вывести любое из них.
5. Если два числа из трех равны, вывести любое из двух.
*/
public class Solution{
    public static void main(String[] args) throws Exception{
        /*BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(reader.readLine()), b=Integer.parseInt(reader.readLine()), c=Integer.parseInt(reader.readLine());
        int buf;
        if(a<b){
            buf=a;
            a=b;
            b=buf;
        }
        if(b<c){
            buf=b;
            b=c;
            c=buf;
        }
        if(a<b){
            buf=a;
            a=b;
            b=buf;
        }
        System.out.println(b);*/
        int a=0,b=1,c=-2147483648;
        System.out.println((a + b + c) - max(max(a, b), c) + max(max(-a, -b), -c));
    }
    public static int max(int a, int b) {
        if (a >= b)
            return a;
        else
            return b;
    }
}