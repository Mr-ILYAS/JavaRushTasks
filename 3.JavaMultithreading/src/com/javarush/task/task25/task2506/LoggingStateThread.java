package com.javarush.task.task25.task2506;
/*
Мониторинг состояния нити

Cоздай класс нити LoggingStateThread, которая будет выводить в консоль все состояния (State) переданной в конструктор нити.
Нить LoggingStateThread должна сама завершаться после остановки переданной в конструктор нити.
Метод main не участвует в тестировании.

Требования:
1. Создай класс LoggingStateThread в отдельном файле. Он должен наследовать класс Thread.
2. Класс LoggingStateThread должен содержать поле нити, за которой он будет следить. Это поле должно инициализироваться через конструктор.
3. Переопредели метод run в классе LoggingStateThread.
4. После запуска класс LoggingStateThread должен выводить в консоль изменения состояния переданной нити.
5. После завершения работы наблюдаемой нити, LoggingStateThread так же должен завершить работу.
*/
public class LoggingStateThread extends Thread{
    private Thread thread;

    @Override
    public void run(){
        State state = thread.getState();
        System.out.println(state);
        while (!state.equals(State.TERMINATED)){
            State newState=thread.getState();
            if(!state.equals(newState)){
                state = newState;
                System.out.println(state);
            }
        }
        interrupt();
    }

    public LoggingStateThread(Thread thread) {
        this.thread = thread;
    }
}