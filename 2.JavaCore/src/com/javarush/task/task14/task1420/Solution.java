package com.javarush.task.task14.task1420;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
НОД

Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.

Требования:
1. Программа должна считывать с клавиатуры 2 строки.
2. В случае если введенные строки невозможно преобразовать в положительные целые числа, должно возникать исключение.
3. Программа должна выводить данные на экран.
4. Программа должна выводить на экран наибольший общий делитель(НОД) чисел считанных с клавиатуры и успешно завершаться.
*/
public class Solution{
	public static void main(String[] args) throws Exception{
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		int a=Integer.parseInt(reader.readLine());
		int b=Integer.parseInt(reader.readLine());
		if(a<1||b<1)throw new Exception();
		System.out.println(nod(a,b));
	}
	public static int nod(int a,int b){
		if(a==b)return a;
		if(a==0)return b;
		if(b==0)return a;
		if((~a&1)!=0){
			if((b&1)!=0) return nod(a>>1,b);
			else return nod(a>>1,b>>1)<<1;
		}
		if((~b&1)!=0) return nod(a,b>>1);
		if(a>b) return nod((a-b)>>1,b);
		return nod((b-a)>>1,a);
	}
}