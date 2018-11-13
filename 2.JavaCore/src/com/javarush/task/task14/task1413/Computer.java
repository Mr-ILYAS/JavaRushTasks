package com.javarush.task.task14.task1413;
class Computer{
    private Keyboard keyboard;
    private Mouse mouse;
    private Monitor monitor;
    public Computer(Keyboard keyboard,Mouse mouse,Monitor monitor){
        this.keyboard=keyboard;
        this.mouse=mouse;
        this.monitor=monitor;
    }
    Keyboard getKeyboard(){return keyboard;}
    Mouse getMouse(){return mouse;}
    Monitor getMonitor(){return monitor;}
}