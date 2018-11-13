package com.javarush.task.task10.task1013;
/*
Конструкторы класса Human

Напиши класс Human с 6 полями.
Придумай и реализуй 10 различных конструкторов для него.
Каждый конструктор должен иметь смысл.

Требования:
1. Программа не должна считывать данные с клавиатуры.
2. В классе Human должно быть 6 полей.
3. Все поля класса Human должны быть private.
4. В классе Human должно быть 10 конструкторов.
5. Все конструкторы класса Human должны быть public.
*/
public class Solution{
    public static void main(String[] args){
    }
    public static class Human{
        private String name;
        private String lastname;
        private java.util.Date dateborn;
        private String address;
        private String contact;
        private boolean gender;
        public Human(String name,boolean gender,java.util.Date dateborn){
            this.name=name;
            this.lastname=" ";
            this.gender=gender;
            this.dateborn=dateborn;
            this.address=" ";
            this.contact=" ";
        }
        public Human(boolean gender,String lastname,java.util.Date dateborn){
            this.name=" ";
            this.lastname=lastname;
            this.gender=gender;
            this.dateborn=dateborn;
            this.address=" ";
            this.contact=" ";
        }
        public Human(String name,String lastname,boolean gender,java.util.Date dateborn){
            this.name=name;
            this.lastname=lastname;
            this.gender=gender;
            this.dateborn=dateborn;
            this.address=" ";
            this.contact=" ";
        }
        public Human(String name,String lastname,boolean gender,java.util.Date dateborn,String address){
            this.name=name;
            this.lastname=lastname;
            this.gender=gender;
            this.dateborn=dateborn;
            this.address=address;
            this.contact=" ";
        }
        public Human(String name,String lastname,java.util.Date dateborn,boolean gender,String contact){
            this.name=name;
            this.lastname=lastname;
            this.gender=gender;
            this.dateborn=dateborn;
            this.address=" ";
            this.contact=contact;
        }
        public Human(String name,String lastname,boolean gender,java.util.Date dateborn,String address,String contact){
            this.name=name;
            this.lastname=lastname;
            this.gender=gender;
            this.dateborn=dateborn;
            this.address=address;
            this.contact=contact;
        }
        public Human(String name,boolean gender,java.util.Date dateborn,String contact){
            this.name=name;
            this.lastname=" ";
            this.gender=gender;
            this.dateborn=dateborn;
            this.address=" ";
            this.contact=contact;
        }
        public Human(String name,java.util.Date dateborn,boolean gender,String address){
            this.name=name;
            this.lastname=" ";
            this.gender=gender;
            this.dateborn=dateborn;
            this.address=address;
            this.contact=" ";
        }
        public Human(String name,boolean gender,java.util.Date dateborn,String contact,String address){
            this.name=name;
            this.lastname=" ";
            this.gender=gender;
            this.dateborn=dateborn;
            this.address=address;
            this.contact=contact;
        }
        public Human(String name,boolean gender,String contact){
            this.name=name;
            this.lastname=" ";
            this.gender=gender;
            this.dateborn=null;
            this.address=" ";
            this.contact=contact;
        }
    }
}