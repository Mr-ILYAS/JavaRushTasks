package com.javarush.task.task08.task0824;
import java.util.ArrayList;
/*
Собираем семейство

1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.

Требования:
1. Программа должна выводить текст на экран.
2. Класс Human должен содержать четыре поля.
3. Класс Human должен содержать один метод.
4. Класс Solution должен содержать один метод.
5. Программа должна создавать объекты и заполнять их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
*/
public class Solution{
    public static void main(String[] args){
        ArrayList<Human> arr;
        Human child1=new Human("Сын",true,6,new ArrayList<>());
        Human child2=new Human("Дочь1",false,4,new ArrayList<>());
        Human child3=new Human("Дочь2",false,1,new ArrayList<>());
        arr=new ArrayList<>();
        arr.add(child1);
        arr.add(child2);
        arr.add(child3);
        Human father=new Human("Папа",true,35,arr);
        Human mother=new Human("Мама",false,32,arr);
        arr=new ArrayList<>();
        arr.add(father);
        Human grandpa1=new Human("Дед1",true,79,arr);
        Human grandma1=new Human("Бабка1",false,75,arr);
        arr=new ArrayList<>();
        arr.add(mother);
        Human grandpa2=new Human("Дед2",true,68,arr);
        Human grandma2=new Human("Бабка2",false,63,arr);
        System.out.println(grandpa1.toString());
        System.out.println(grandma1.toString());
        System.out.println(grandpa2.toString());
        System.out.println(grandma2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());
    }
    public static class Human{
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;
        public Human(String name,boolean sex,int age,ArrayList<Human> children){
            this.name=name;
            this.sex=sex;
            this.age=age;
            this.children=children;
        }
        public String toString(){
            String text="Имя: "+this.name+", пол: "+(this.sex?"мужской":"женский")+", возраст: ";
            int childCount=this.children.size();
            if(childCount>0){
                text+=", дети: "+this.children.get(0).name;
                for(int i=1;i<childCount;i++){
                    Human child=this.children.get(i);
                    text+=", "+child.name;
                }
            }
            return text;
        }
    }
}