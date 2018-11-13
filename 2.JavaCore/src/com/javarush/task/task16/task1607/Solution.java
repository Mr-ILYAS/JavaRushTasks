package com.javarush.task.task16.task1607;
import java.util.ArrayList;
import java.util.List;
/*
Horse Racing

Разберись, что делает программа.
Реализуй метод calculateHorsesFinished.
Он должен:
1. Посчитать количество финишировавших лошадей и возвратить его. Используй метод isFinished().
2. Если лошадь еще не пришла к финишу (!isFinished()), то:
2.1. Вывести в консоль «Waiting for » + horse.getName().
2.2. Подождать, пока она завершит гонку. Подумай, какой метод нужно использовать для этого.
2.3. Не считать такую лошадь финишировавшей.

Требования:
1. Метод calculateHorsesFinished должен вернуть количество финишировавших лошадей.
2. Метод calculateHorsesFinished должен вызывать метод isFinished у каждой лошади из переданного списка.
3. Если какая-либо из переданных в списке лошадей еще не финишировала, метод calculateHorsesFinished должен вывести
    в консоль "Waiting for " + horse.getName(). Пример сообщения для первой лошади: "Waiting for Horse_01".
4. Если какая-либо из переданных в списке лошадей еще не финишировала, метод calculateHorsesFinished должен подождать
    пока она финиширует. Используй правильный метод для ожидания.
5. После завершения работы программы, консоль должна содержать информацию о том, что все лошади финишировали.
    Пример сообщения для первой лошади: "Horse_01 has finished the race!".
*/
public class Solution{
	public static int countHorses=10;
	public static void main(String[] args) throws InterruptedException{
		List<Horse> horses=prepareHorsesAndStart();
		while(calculateHorsesFinished(horses)!=countHorses) ;
	}
	public static int calculateHorsesFinished(List<Horse> horses) throws InterruptedException{
		int countFinished=0;
		for(Horse h:horses){
			if(h.isFinished()) countFinished++;
			else{
				System.out.println("Waiting for "+h.getName());
				h.join();
			}
		}
		return countFinished;
	}
	public static List<Horse> prepareHorsesAndStart(){
		List<Horse> horses=new ArrayList<>(countHorses);
		String number;
		for(int i=0;i++<countHorses;){
			number=i<10?("0"+i):""+i;
			horses.add(new Horse("Horse_"+number));
		}
		for(int i=0;i<countHorses;horses.get(i++).start()) ;
		return horses;
	}
	public static class Horse extends Thread{
		private boolean isFinished;
		public Horse(String name){
			super(name);
		}
		public boolean isFinished(){
			return isFinished;
		}
		public void run(){
			String s="";
			for(int i=0;;){
				s+=""+i;
				if(i++==1000){
					s=" has finished the race!";
					System.out.println(getName()+s);
					isFinished=true;
					break;
				}
			}
		}
	}
}