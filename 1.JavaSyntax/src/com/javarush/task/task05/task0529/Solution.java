package com.javarush.task.task05.task0529;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
Консоль-копилка

Вводить с клавиатуры числа и считать их сумму, пока пользователь не введет слово «сумма».
Вывести на экран полученную сумму.

Требования:
1. Программа должна считывать данные с клавиатуры.
2. Программа должна корректно работать, если пользователь ввел одно число и слово «сумма».
3. Программа должна корректно работать, если пользователь ввел два числа число и слово «сумма».
4. Программа должна корректно работать, если пользователь ввел более двух чисел и слово «сумма».
5. Программа должна выводить текст на экран.
6. Программа должна прекращать считывать данные с клавиатуры после того пользователь введет слово "сумма" и нажмет Enter.
*/
public class Solution{
    public static void main(String[] args) throws Exception{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String s;
        for(int sum=0, k;true;){
            s=reader.readLine();
            try{
                k=Integer.parseInt(s);
            }catch(NumberFormatException e){
                if(s.equals("сумма")){
                    System.out.print(sum);
                    break;
                }
                k=0;
            }
            sum+=k;
        }
    }
}