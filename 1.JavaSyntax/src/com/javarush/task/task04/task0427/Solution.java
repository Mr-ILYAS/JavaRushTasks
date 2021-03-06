package com.javarush.task.task04.task0427;
/* 
Описываем числа

Ввести с клавиатуры целое число в диапазоне 1 — 999. Вывести его строку-описание следующего вида:
«четное однозначное число» — если число четное и имеет одну цифру,
«нечетное однозначное число» — если число нечетное и имеет одну цифру,
«четное двузначное число» — если число четное и имеет две цифры,
«нечетное двузначное число» — если число нечетное и имеет две цифры,
«четное трехзначное число» — если число четное и имеет три цифры,
«нечетное трехзначное число» — если число нечетное и имеет три цифры.
Если введенное число не попадает в диапазон 1 — 999, в таком случае ничего не выводить на экран.

Пример для числа 100:
четное трехзначное число

Пример для числа 51:
нечетное двузначное число


Требования:
1. Программа должна считывать одно число c клавиатуры.
2. Программа должна использовать команду System.out.println() или System.out.print().
3. Если число четное и имеет одну цифру, вывести "четное однозначное число".
4. Если число нечетное и имеет одну цифру, вывести "нечетное однозначное число".
5. Если число четное и имеет две цифры, вывести "четное двузначное число".
6. Если число нечетное и имеет две цифры, вывести "нечетное двузначное число".
7. Если число четное и имеет три цифры, вывести "четное трехзначное число".
8. Если число нечетное и имеет три цифры, вывести "нечетное трехзначное число".
9. Если введенное число не попадает в диапазон 1 - 999, ничего не выводить на экран
*/
import java.io.*;
public class Solution{
	public static void main(String[] args) throws Exception{
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		int i=Integer.parseInt(reader.readLine());
		if(i>0&&i<1000)
			System.out.println(
        	    i/100>0? i%2==0?"четное трехзначное число":"нечетное трехзначное число" :
				i/10>0? i%2==0?"четное двузначное число":"нечетное двузначное число" :
				i%2==0?"четное однозначное число":"нечетное однозначное число"
			);
	}
}