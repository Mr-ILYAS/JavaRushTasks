package com.javarush.task.task20.task2027;

import java.util.LinkedList;
import java.util.List;
/*
Кроссворд

1. Дан двумерный массив, который содержит буквы английского алфавита в нижнем регистре.
2. Метод detectAllWords должен найти все слова из words в массиве crossword.
3. Элемент(startX, startY) должен соответствовать первой букве слова, элемент(endX, endY) - последней.
text - это само слово, располагается между начальным и конечным элементами
4. Все слова есть в массиве.
5. Слова могут быть расположены горизонтально, вертикально и по диагонали как в нормальном, так и в обратном порядке.
6. Метод main не участвует в тестировании.

Требования:
1. В классе Solution должен существовать метод detectAllWords.
2. В классе Solution должен существовать класс Word.
3. Метод detectAllWords должен быть статическим.
4. Метод detectAllWords должен быть публичным.
5. Метод detectAllWords должен возвращать список всех слов в кроссворде (согласно условию задачи).
*/
public class Solution{
	public static void main(String[] args){
		int[][] crossword = new int[][]{
				{'f', 'd', 'e', 'r', 'l', 'k'},
				{'u', 's', 'a', 'm', 'e', 'o'},
				{'l', 'n', 'g', 'r', 'o', 'v'},
				{'m', 'l', 'p', 'r', 'r', 'h'},
				{'p', 'o', 'e', 'e', 'j', 'j'}
		};
		detectAllWords(crossword, "home", "same");
        /*
		Ожидаемый результат
		home - (5, 3) - (2, 0)
		same - (1, 1) - (4, 1)
         */
	}
	public static List<Word> detectAllWords(int[][] crossword, String... words){
		List<Word> allWords = new LinkedList<>();
		for (String word: words) {
			char firstLetter = word.charAt(0);
			for (int i =0 ; i <crossword.length; i++) {
				for (int j = 0; j <crossword[i].length; j++) {

					// If we find first letter of this word, we check positions of other letters
					if (crossword[i][j]== firstLetter ){

						try{
							allWords.add(checkWord(crossword, word,i,j,0,+1));
						}catch (Exception e){}

						try{
							allWords.add(checkWord(crossword, word,i,j,+1,0));
						}catch (Exception e){}
						try{
							allWords.add(checkWord(crossword, word,i,j,-1,0));
						}catch (Exception e){}
						try{
							allWords.add(checkWord(crossword, word,i,j,0,-1));
						}catch (Exception e){}
						try{
							allWords.add(checkWord(crossword, word,i,j,+1,+1));
						}catch (Exception e){}
						try{
							allWords.add(checkWord(crossword, word,i,j,-1,-1));
						}catch (Exception e){}
						try{
							allWords.add(checkWord(crossword, word,i,j,+1,-1));
						}catch (Exception e){}
						try{
							allWords.add(checkWord(crossword, word,i,j,-1,+1));
						}catch (Exception e){}

					}
				}
			}



		}
		return allWords;
	}
	public static Word checkWord(int[][] crossword, String word, int i, int j, int vectorI, int vectorJ) throws Exception {
		int positions[] = new int[4];
		Word wordFirst = new Word(word);
		positions[0] = j;
		positions[1] = i;
		for (int checkLength = 1; checkLength < word.length(); checkLength++) {
			if (word.charAt(checkLength) != crossword[i + vectorI*checkLength][j + vectorJ*checkLength]) {
				throw new Exception();
			}
			if (checkLength == word.length() - 1) {
				positions[3] = i + (vectorI * word.length()) - vectorI;
				positions[2] = j + (vectorJ*word.length()) - vectorJ;
				wordFirst.setStartPoint(positions[0], positions[1]);
				wordFirst.setEndPoint(positions[2], positions[3]);
			}
		}
		return wordFirst;
	}
	public static class Word{
		private String text;
		private int startX;
		private int startY;
		private int endX;
		private int endY;
		public Word(String text){
			this.text = text;
		}
		public void setStartPoint(int i, int j){
			startX = i;
			startY = j;
		}
		public void setEndPoint(int i, int j){
			endX = i;
			endY = j;
		}
		@Override
		public String toString(){
			return String.format("%s - (%d, %d) - (%d, %d)", text, startX, startY, endX, endY);
		}
	}
}