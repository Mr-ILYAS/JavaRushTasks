package com.javarush.task.task20.task2002;
import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/*
Читаем и пишем в файл: JavaRush

Реализуйте логику записи в файл и чтения из файла для класса JavaRush.
В файле your_file_name.tmp может быть несколько объектов JavaRush.
Метод main реализован только для вас и не участвует в тестировании.

Требования:
1. Логика чтения/записи реализованная в методах save/load должна работать корректно в случае, если список users пустой.
2. Логика чтения/записи реализованная в методах save/load должна работать корректно в случае, если список users не пустой.
3. Класс Solution.JavaRush не должен поддерживать интерфейс Serializable.
4. Класс Solution.JavaRush должен быть публичным.
5. Класс Solution.JavaRush не должен поддерживать интерфейс Externalizable.
*/
public class Solution{
	public static void main(String[] args){
		//you can find your_file_name.tmp in your TMP directory or fix outputStream/inputStream according to your real file location
		//вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
		try{
			File your_file_name = File.createTempFile("your_file_name", null);
			OutputStream outputStream = new FileOutputStream(your_file_name);
			InputStream inputStream = new FileInputStream(your_file_name);
			JavaRush javaRush = new JavaRush();
			//initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
			User user = new User();
			user.setFirstName("name1");
			user.setLastName("lastname1");
			user.setBirthDate(new Date(14556567678L));
			user.setMale(false);
			user.setCountry(User.Country.OTHER);
			javaRush.users.add(user);
			
			user = new User();
			user.setFirstName("name2");
			user.setLastName("lastname2");
			user.setBirthDate(new Date(14556567678L));
			user.setMale(true);
			user.setCountry(User.Country.RUSSIA);
			javaRush.users.add(user);
			
			user = new User();
			user.setFirstName("name3");
			user.setLastName("lastname3");
			user.setBirthDate(new Date(14556567678L));
			user.setMale(false);
			user.setCountry(User.Country.UKRAINE);
			javaRush.users.add(user);
			
			javaRush.save(outputStream);
			JavaRush loadedObject = new JavaRush();
			loadedObject.load(inputStream);
			
			System.out.println(loadedObject.users.get(0).getFirstName());
			System.out.println(loadedObject.users.get(0).getLastName());
			System.out.println(String.valueOf(loadedObject.users.get(0).getBirthDate().getTime()));
			System.out.println(String.valueOf(loadedObject.users.get(0).isMale()));
			System.out.println(String.valueOf(loadedObject.users.get(0).getCountry()));
			System.out.println();
			
			System.out.println(loadedObject.users.get(1).getFirstName());
			System.out.println(loadedObject.users.get(1).getLastName());
			System.out.println(String.valueOf(loadedObject.users.get(1).getBirthDate().getTime()));
			System.out.println(String.valueOf(loadedObject.users.get(1).isMale()));
			System.out.println(String.valueOf(loadedObject.users.get(1).getCountry()));
			System.out.println();
			
			System.out.println(loadedObject.users.get(2).getFirstName());
			System.out.println(loadedObject.users.get(2).getLastName());
			System.out.println(String.valueOf(loadedObject.users.get(2).getBirthDate().getTime()));
			System.out.println(String.valueOf(loadedObject.users.get(2).isMale()));
			System.out.println(String.valueOf(loadedObject.users.get(2).getCountry()));
			System.out.println();
			
			if(loadedObject.equals(javaRush)) System.out.println("yes");
			else System.out.println("no");
		}catch(IOException e){
			//e.printStackTrace();
			System.out.println("Oops, something wrong with my file");
		}catch(Exception e){
			//e.printStackTrace();
			System.out.println("Oops, something wrong with save/load method");
		}
	}
	public static class JavaRush{
		public List<User> users = new ArrayList<>();
		public void save(OutputStream outputStream) throws Exception{
			for(User u : users){
				outputStream.write((u.getFirstName() + "\n").getBytes());
				outputStream.write((u.getLastName() + "\n").getBytes());
				outputStream.write((String.valueOf(u.getBirthDate().getTime()) + "\n").getBytes());
				outputStream.write((String.valueOf(u.isMale()) + "\n").getBytes());
				outputStream.write((u.getCountry().getDisplayedName() + "\n").getBytes());
			}
			outputStream.close();
		}
		public void load(InputStream inputStream) throws Exception{
			BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
			User u;
			while(reader.ready()){
				u = new User();
				u.setFirstName(reader.readLine());
				u.setLastName(reader.readLine());
				u.setBirthDate(new Date(Long.parseLong(reader.readLine())));
				u.setMale(Boolean.parseBoolean(reader.readLine()));
				u.setCountry(User.Country.valueOf(reader.readLine().toUpperCase()));
				users.add(u);
			}
			reader.close();
		}
		@Override
		public boolean equals(Object o){
			if(this == o) return true;
			if(o == null || getClass() != o.getClass()) return false;
			JavaRush javaRush = (JavaRush)o;
			return users != null ? users.equals(javaRush.users) : javaRush.users == null;
		}
		@Override
		public int hashCode(){
			return users != null ? users.hashCode() : 0;
		}
	}
}