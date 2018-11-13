package com.javarush.task.task16.task1632;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
/*
Клубок

1. Создай 5 различных своих нитей c отличным от Thread типом:
1.1. Нить 1 должна бесконечно выполняться;
1.2. Нить 2 должна выводить "InterruptedException" при возникновении исключения InterruptedException;
1.3. Нить 3 должна каждые полсекунды выводить "Ура";
1.4. Нить 4 должна реализовать интерфейс Message, при вызове метода showWarning нить должна останавливаться;
1.5. Нить 5 должна читать с консоли числа пока не введено слово "N", а потом вывести в консоль сумму введенных чисел.
2. В статическом блоке добавь свои нити в List<Thread> threads в перечисленном порядке.
3. Нити не должны стартовать автоматически.

Подсказка:
Нить 4 можно проверить методом isAlive()

Требования:
1. Статический блок класса Solution должен создавать и добавлять 5 нитей в список threads.
2. Нити из списка threads не должны стартовать автоматически.
3. Нить 1 из списка threads должна бесконечно выполняться.
4. Нить 2 из списка threads должна выводить "InterruptedException" при возникновении исключения InterruptedException.
5. Нить 3 из списка threads должна каждые полсекунды выводить "Ура".
6. Нить 4 из списка threads должна реализовать интерфейс Message, при вызове метода showWarning нить должна останавливаться.
7. Нить 5 из списка threads должна читать с консоли числа пока не введено слово "N", а потом вывести в консоль сумму введенных чисел.
*/
public class Solution{
	public static List<Thread> threads=new ArrayList<>(5);
	static{
		threads.add(new Thread1("Infinity"));
		threads.add(new Thread2("InterruptedException"));
		threads.add(new Thread3("Ура"));
		threads.add(new Thread4("isWarning"));
		threads.add(new Thread5("SumN"));
	}
	public static void main(String[] args){
		for(Thread t:threads)t.start();
	}
	public static class Thread1 extends Thread{
		public Thread1(String name){
			super(name);
		}
		@Override
		public void run(){
			while(true);
		}
	}
	public static class Thread2 extends Thread{
		public Thread2(String name){
			super(name);
		}
		@Override
		public void run(){
			while(true)if(isInterrupted())System.out.println("InterruptedException");
		}
	}
	public static class Thread3 extends Thread{
		public Thread3(String name){
			super(name);
		}
		@Override
		public void run(){
			try{
				while(true){
					System.out.println("Ура");
					Thread.sleep(500);
				}
			}catch(InterruptedException e){}
		}
	}
	public static class Thread4 extends Thread implements Message{
		public Thread4(String name){
			super(name);
		}
		@Override
		public void run(){
			while(!isInterrupted());
		}
		@Override
		public void showWarning(){
			interrupt();
		}
	}
	public static class Thread5 extends Thread{
		public Thread5(String name){
			super(name);
		}
		@Override
		public void run(){
			try(BufferedReader reader=new BufferedReader(new InputStreamReader(System.in))){
				int i=0;
				for(String s=reader.readLine();!s.equals("N");s=reader.readLine())i+=Integer.parseInt(s);
				System.out.println(i);
			}catch(IOException e){}
		}
	}
}