package com.javarush.task.task07.task0724;
/*
Семейная перепись

Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.

Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.

Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…

Требования:
1. Программа не должна считывать данные с клавиатуры.
2. Добавить в класс Human поля: имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
3. Добавить в класс конструктор public Human(String name, boolean sex, int age).
*/
public class Solution{
    public static void main(String[] args){
        Human GrandpaF=new Human("Дед папин",true,75);
        Human GrandpaM=new Human("Дед мамин",true,80);
        Human GrandmaF=new Human("Бабушка папина",false,70);
        Human GrandmaM=new Human("Бабушка мамина",false,75);
        Human Father=new Human("Папа",true,45,GrandpaF,GrandmaF);
        Human Mother=new Human("Мама",false,40,GrandpaM,GrandmaM);
        Human Child1=new Human("Сын1",true,17,Father,Mother);
        Human Child2=new Human("Сын2",true,14,Father,Mother);
        Human Child3=new Human("Дочь",false,10,Father,Mother);
        System.out.println(GrandpaF);
        System.out.println(GrandmaF);
        System.out.println(GrandpaM);
        System.out.println(GrandmaM);
        System.out.println(Father);
        System.out.println(Mother);
        System.out.println(Child1);
        System.out.println(Child2);
        System.out.println(Child3);
    }
    public static class Human{
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;
        Human(String name,boolean sex,int age,Human father,Human mother){
            this.name=name;
            this.sex=sex;
            this.age=age;
            this.father=father;
            this.mother=mother;
        }
        Human(String name,boolean sex,int age){
            this.name=name;
            this.sex=sex;
            this.age=age;
        }
        public String toString(){return "Имя: "+this.name+", пол: "+(this.sex?"мужской":"женский")+", возраст: "+this.age+(this.father==null?"":", отец: "+this.father.name)+(this.mother==null?"":", мать: "+this.mother.name);}
    }
}