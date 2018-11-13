package com.javarush.task.task03.task0307;
/*
Привет Starcraft!

Создать 10 зергов, 5 протоссов и 12 терран.
Дать им всем уникальные имена.

Требования:
1. Нужно создать 10 объектов типа Zerg и каждому из них дать свое имя.
2. Нужно создать 5 объектов типа Protoss и каждому из них дать свое имя.
3. Нужно создать 12 объектов типа Terran и каждому из них дать свое имя.
4. Нельзя изменять классы Zerg, Protoss и Terran.
*/
public class Solution {
    public static void main(String[] args) {
        Zerg z=new Zerg();
        z.name="1";
        z=new Zerg();
        z.name="2";
        z=new Zerg();
        z.name="3";
        z=new Zerg();
        z.name="4";
        z=new Zerg();
        z.name="5";
        z=new Zerg();
        z.name="6";
        z=new Zerg();
        z.name="7";
        z=new Zerg();
        z.name="8";
        z=new Zerg();
        z.name="9";
        z=new Zerg();
        z.name="10";
        Protoss p=new Protoss();
        p.name="p1";
        p=new Protoss();
        p.name="p2";
        p=new Protoss();
        p.name="p3";
        p=new Protoss();
        p.name="p4";
        p=new Protoss();
        p.name="p5";
        Terran t=new Terran();
        t.name="t1";
        t=new Terran();
        t.name="t2";
        t=new Terran();
        t.name="t3";
        t=new Terran();
        t.name="t4";
        t=new Terran();
        t.name="t5";
        t=new Terran();
        t.name="t6";
        t=new Terran();
        t.name="t7";
        t=new Terran();
        t.name="t8";
        t=new Terran();
        t.name="t9";
        t=new Terran();
        t.name="t10";
        t=new Terran();
        t.name="t11";
        t=new Terran();
        t.name="t12";
    }
    public static class Zerg {public String name;}
    public static class Protoss {public String name;}
    public static class Terran {public String name;}
}