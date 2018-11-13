package com.javarush.task.task14.task1408;
class RussianHen extends Hen{
    @Override
    public int getCountOfEggsPerMonth(){
        return 30;
    }
    @Override
    String getDescription(){
        return super.getDescription()+" Моя страна - "+Country.RUSSIA+". Я несу "+getCountOfEggsPerMonth()+" яиц в месяц.";
    }
}