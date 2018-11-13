package com.javarush.task.task14.task1419;
import java.lang.invoke.LambdaConversionException;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.ArrayList;
import java.util.List;
/*
Нашествие исключений

Заполни список exceptions десятью(10) различными исключениями.
Первое исключение уже реализовано в методе initExceptions.

Требования:
1. Список exceptions должен содержать 10 элементов.
2. Все элементы списка exceptions должны быть исключениями(потомками класса Throwable).
3. Все элементы списка exceptions должны быть уникальны.
4. Метод initExceptions должен быть статическим.
*/
public class Solution{
	public static List<Exception> exceptions=new ArrayList<>();
	public static void main(String[] args){
		initExceptions();
		for(Exception exception : exceptions){
			System.out.println(exception);
		}
	}
	private static void initExceptions(){
		try{float i=1/0;}
		catch(Exception e){exceptions.add(e);}
		
		try{throw new NegativeArraySizeException();}
		catch(Exception e){exceptions.add(e);}
		
		try{throw new IllegalAccessException();}
		catch(Exception e){exceptions.add(e);}
		
		try{throw new NullPointerException();}
		catch(Exception e){exceptions.add(e);}
		
		try{throw new NumberFormatException();}
		catch(Exception e){exceptions.add(e);}
		
		try{throw new IllegalStateException();}
		catch(Exception e){exceptions.add(e);}
		
		try{throw new SecurityException();}
		catch(Exception e){exceptions.add(e);}
		
		try{throw new UnsupportedOperationException();}
		catch(Exception e){exceptions.add(e);}
		
		try{throw new LambdaConversionException();}
		catch(Exception e){exceptions.add(e);}
		
		try{throw new MalformedParameterizedTypeException();}
		catch(Exception e){exceptions.add(e);}
	}
}