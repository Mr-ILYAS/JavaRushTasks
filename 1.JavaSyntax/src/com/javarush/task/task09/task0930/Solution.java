package com.javarush.task.task09.task0930;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
/*
Задача по алгоритмам

Задача: Пользователь вводит с клавиатуры список слов (и чисел).
Слова вывести в возрастающем порядке, числа — в убывающем.

Пример ввода:
Вишня
1
Боб
3
Яблоко
2
0
Арбуз

Пример вывода:
Арбуз
3
Боб
2
Вишня
1
0
Яблоко

Требования:
1. Программа должна считывать данные с клавиатуры.
2. Программа должна выводить данные на экран.
3. Выведенные слова должны быть упорядочены по возрастанию.
4. Выведенные числа должны быть упорядочены по убыванию.
5. Метод main должен использовать метод sort.
6. Метод sort должен использовать метод isGreaterThan.
7. Метод sort должен использовать метод isNumber.
*/
public class Solution{
    public static void main(String[] args) throws Exception{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list=new ArrayList<>();
        while(true){
            String s=reader.readLine();
            if(s.isEmpty())break;
            list.add(s);
        }
        String[] array=list.toArray(new String[list.size()]);
        sort(array);
        for(String x : array)System.out.println(x);
    }
    public static void sort(String[] array){
        String s;
        for(int i=0;i<array.length;i++){
            if(isNumber(array[i])){
                for(int j=0;j<array.length;j++){
                    if(isNumber(array[j])){
                        if(Integer.parseInt(array[i])>Integer.parseInt(array[j])){
                            s=array[i];
                            array[i]=array[j];
                            array[j]=s;
                        }
                    }
                }
            }else{
                for(int j=0;j<array.length;j++){
                    if(!(isNumber(array[j]))){
                        if(!(isGreaterThan(array[i],array[j]))){
                            s=array[i];
                            array[i]=array[j];
                            array[j]=s;
                        }
                    }
                }
            }
        }
    }
    public static boolean isGreaterThan(String a,String b){return a.compareTo(b)>0;}
    public static boolean isNumber(String s){
        if(s.length()==0) return false;
        char[] chars=s.toCharArray();
        for(int i=0;i<chars.length;i++){
            char c=chars[i];
            if((i!=0&&c=='-')/* есть '-' внутри строки*/ ||(!Character.isDigit(c)&&c!='-'))/* не цифра и не начинается с '-' */return false;
        }
        return true;
    }
}