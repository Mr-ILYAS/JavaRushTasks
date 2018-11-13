package com.javarush.task.task10.task1020;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
Задача по алгоритмам

Задача: ввести с клавиатуры 30 чисел. Вывести 10-е и 11-е минимальные числа.
Пояснение:
Самое минимальное число – 1-е минимальное.
Следующее минимальное после него – 2-е минимальное

Пример:
1 6 5 7 1 15 63 88
Первое минимальное – 1
Второе минимальное – 1
Третье минимальное – 5
Четвертое минимальное – 6

Требования:
1. Программа должна считывать данные с клавиатуры.
2. Программа должна выводить текст на экран.
3. Класс Solution должен содержать два метода.
4. Метод sort() должен сортировать массив элементов.
5. Метод main() должен вызывать метод sort().
6. Программа должна выводить 10-е и 11-е минимальные числа. Каждое значение с новой строки.
*/
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[30];
        for (int i = 0; i < 30; array[i++] = Integer.parseInt(reader.readLine())) ;
        sort(array);
        /*int k=1;
        for(int i:array) System.out.println(k+++") "+i);*/
        System.out.println(array[9]);
        System.out.println(array[10]);
    }

    //public static void sort(int[] array){Arrays.sort(array);}
    public static void sort(int[] array) {
        MergeSort(array, 0, array.length - 1);
    }
    private static void MergeSort(int[] array, int left, int n) {
        if (n <= left) return;
        int mid = left + (n - left) / 2;
        MergeSort(array, 0, mid);
        MergeSort(array, mid + 1, n);
        int[] buf = Arrays.copyOf(array, array.length);
        for (int k = left; k <= n; k++) buf[k] = array[k];
        for (int k = left, i = k, j = mid + 1; k <= n; k++) {
            if (i > mid) array[k] = buf[j++];
            else if (j > n) array[k] = buf[i++];
            else if (buf[j] < buf[i]) array[k] = buf[j++];
            else array[k] = buf[i++];
        }
    }
}