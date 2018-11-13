package com.javarush.task.task23.task2312;

import java.util.ArrayList;
/*
Змейка(1)

А теперь напишем игру "змейка".

Для этого нам понадобятся:
а) собственно сама змея (класс Snake)
б) комната, в которой она будет ползать (класс Room)
в) мыши, которых она будет есть (класс Mouse)

Создай классы Snake, Room, Mouse

Не забудь создать метод public static void main(String[] args) в классе Room.

Требования:
1. Класс Snake должен быть создан в отдельном файле.
2. Класс Room должен быть создан в отдельном файле.
3. Класс Mouse должен быть создан в отдельном файле.
4. Класс Room должен содержать корректно объявленный метод main.
---------------------------------------------------------------------------------------
Змейка(2)

Теперь самое интересное - как будет устроена змея.

Что можно сказать о змее:
а) По сути - змея это набор кусочков - клеточек. Но точно известно, что один из них - голова.
б) У змеи есть направление движения.

Так что нам еще понадобятся классы:
SnakeSection - кусочек змеи.
SnakeDirection - класс (enum) будет описывать направление движения змеи.

Создай классы SnakeSection и SnakeDirection.

Требования:
1. Класс SnakeSection должен быть создан в отдельном файле.
2. Перечисление(enum) SnakeDirection должно быть создано в отдельном файле.
---------------------------------------------------------------------------------------
Змейка(3)

Отлично. Я еще добавил класс KeyboardObserver на будущее.
Изучи его внимательно. Пригодится.

Начнем с самого простого - класса Mouse.
Мышь не будет двигаться и у нее будут только координаты и все.
Добавь два приватных поля в класс Mouse: x и y типа int.

Требования:
1. Внимательно изучи класс KeyboardObserver.
2. В классе Mouse должно существовать поле x типа int, доступ к которому разрешен только в пределах этого класса.
3. В классе Mouse должно существовать поле y типа int, доступ к которому разрешен только в пределах этого класса.
---------------------------------------------------------------------------------------
Змейка(4)

Координаты x и y ты уже создал в классе Mouse, а как получить к ним доступ?
Создай корректные геттеры для этих полей и конструктор с двумя параметрами типа int (x и y соответственно).

Требования:
1. В классе Mouse должен быть создан корректный геттер для поля x.
2. В классе Mouse должен быть создан корректный геттер для поля y.
3. В классе Mouse должен быть создан корректно работающий публичный конструктор с двумя параметрами типа int.
---------------------------------------------------------------------------------------
Змейка(5)

Теперь доделаем enum SnakeDirection так, чтобы он содержал возможные направления движения змейки.

Добавь 4 значения UP, DOWN, LEFT, RIGHT.

Должно получиться примерно так:
public enum SnakeDirection
{
 UP,
 RIGHT,
 DOWN,
 LEFT
}

Требования:
1. SnakeDirection должен содержать элемент UP.
2. SnakeDirection должен содержать элемент DOWN.
3. SnakeDirection должен содержать элемент RIGHT.
4. SnakeDirection должен содержать элемент LEFT.
---------------------------------------------------------------------------------------
Змейка(6)

Теперь займемся классом SnakeSection.
Он будет описывать один кусочек змеи.

А у каждого кусочка что есть?
Правильно! Координаты.

Добавь два поля в класс SnakeSection: x и y типа int.
Добавь для них getter'ы и конструктор с двумя параметрами типа int.

Требования:
1. В классе SnakeSection должно существовать поле x типа int, доступ к которому разрешен только в пределах этого класса.
2. В классе SnakeSection должно существовать поле y типа int, доступ к которому разрешен только в пределах этого класса.
3. В классе SnakeSection должен быть создан корректный геттер для поля x.
4. В классе SnakeSection должен быть создан корректный геттер для поля y.
5. В классе SnakeSection должен быть создан корректно работающий публичный конструктор с двумя параметрами типа int.
---------------------------------------------------------------------------------------
Змейка(7)

"Кусочки змеи" мы описали, теперь займемся самой змеей.

У змеи должен быть список кусочков(SnakeSection) и голова.
Пусть головой будет просто самый первый кусочек (с номером 0).

У змеи также есть направление движения - сторона, куда она движется по умолчанию.
А еще есть состояние - жива змея или мертва.
Игра заканчивается тогда, когда змея мертва.

Надо:
а) Добавить в класс Snake поле sections типа List<SnakeSection>.
б) Добавить поле isAlive типа boolean.
в) Добавить поле direction типа SnakeDirection.
г) Для всех полей добавить getter'ы, а для direction еще и setter.

Примечание:
Для полей логического типа геттер принято писать не как getValue(), а как isValue() - это улучшает читабельность кода.
Только не пиши isIsAlive(). Одного is будет вполне достаточно.

Примечание 2:
Все поля создаваемые в этом задании должны быть приватными, а методы - публичными.

Требования:
1. В классе Snake должно быть объявлено поле sections типа List<SnakeSection>.
2. В классе Snake должно быть объявлено поле isAlive типа boolean.
3. В классе Snake должно быть объявлено поле direction типа SnakeDirection.
4. В классе Snake должен быть создан корректный геттер для поля sections.
5. В классе Snake должен быть создан корректный геттер для поля isAlive.
6. В классе Snake должен быть создан корректный геттер для поля direction.
7. В классе Snake должен быть создан корректный сеттер для поля direction.
8. Все поля класса Snake должны быть объявлены с модификатором доступа private.
9. Все методы класса Snake должны быть объявлены с модификатором доступа public.
---------------------------------------------------------------------------------------
Змейка(8)

Настала очередь конструктора класса Snake.

Змея у нас будет поначалу состоять из одного кусочка - головы.
А что для него требуется?
Что необходимо передать в конструктор?
Координаты змеи, конечно же.

Надо:
а) Передать в конструктор координаты головы змеи (x и y).
б) создать в нем первый "кусочек змеи" (голову) и добавить его в коллекцию sections (ArrayList).
в) isAlive выставить в true.
г) не забудь в конструкторе инициализировать переменную sections. В null не много-то и добавишь!
д) создать и реализовать метод int getX(). Метод должен вернуть координату Х головы змеи.
е) создать и реализовать метод int getY(). Метод должен вернуть координату Y головы змеи.
ж) еще добавить классу метод move()- он нам пригодится попозже.
з) созданный конструктор должен быть публичным.

Требования:
1. В классе Snake должен быть создан корректно работающий public конструктор (согласно условию задачи) с двумя параметрами типа int.
2. В классе Snake должен быть создан метод getX() без параметров, возвращающий координату x нулевого элемента списка sections.
3. В классе Snake должен быть создан метод getY() без параметров, возвращающий координату y нулевого элемента списка sections.
4. В классе Snake должен быть создан метод move.
---------------------------------------------------------------------------------------
Змейка(9)

Еще остался самый главный класс - Room.
Что нам нужно для его описания?
Размеры комнаты (width и height) - раз.
Змея - два
Мышь - три.

Надо:
а) создать в классе Room переменные width и height типа int.
б) создать в классе Room переменную snake типа Snake.
в) создать в классе Room переменную mouse типа Snake. Шучу. Типа Mouse, конечно же :).
г) создать для них всех геттеры и сеттеры.
д) создать конструктор. Конструктор должен принимать три параметра: width, height и ... snake!

Требования:
1. В классе Room должна быть создана приватная переменная width типа int.
2. В классе Room должна быть создана приватная переменная height типа int.
3. В классе Room должна быть создана приватная переменная snake типа Snake.
4. В классе Room должна быть создана приватная переменная mouse типа Mouse.
5. В классе Room должен быть создан корректный публичный геттер для поля width.
6. В классе Room должен быть создан корректный публичный геттер для поля height.
7. В классе Room должен быть создан корректный публичный геттер для поля snake.
8. В классе Room должен быть создан корректный публичный геттер для поля mouse.
9. В классе Room должен быть создан корректный публичный сеттер для поля width.
10. В классе Room должен быть создан корректный публичный сеттер для поля height.
11. В классе Room должен быть создан корректный публичный сеттер для поля snake.
12. В классе Room должен быть создан корректный публичный сеттер для поля mouse.
13. В классе Room должен быть создан корректный публичный конструктор с параметрами int, int и Snake  (width, height и snake).
---------------------------------------------------------------------------------------
Змейка(10)

Займемся методом main.

Для начала надо создать в классе Room статическое поле game типа Room. Доступ к переменной должен быть из всех классов.

Затем в методе main:
а) Создать змею - объект типа Snake.
б) Создать комнату - объект типа Room и передать в него ширину, высоту и змею.
в) Установить змее direction равным SnakeDirection.DOWN

Чего еще не хватает? Собственно метода, в котором будет идти вся игровая логика.
И еще нужен метод, который бы отрисовывал все это на экране:
а) создать метод void run()
б) создать метод void print()

Требования:
1. В методе main класса Room должна быть создана новая змея(объект типа Snake).
2. В методе main класса Room должно быть инициализировано поле game.
3. В методе main класса Room направление движения змеи должно быть установлено равным SnakeDirection.DOWN.
4. В классе Room должен быть создан метод run(), тип возвращаемого значения void.
5. В классе Room должен быть создан метод print(), тип возвращаемого значения void.
6. В классе Room должно быть создано статическое неприватное поле game типа Room.
---------------------------------------------------------------------------------------
Змейка(11)

Теперь логика управления мышью.

С мышью у нас будут происходить две вещи.

Первая - змея съедает мышь.

Вторая - появляется новая мышь в случайной точке комнаты.

Надо написать и реализовать метод createMouse() в классе Room.

В этом методе мы просто должны создавать новую мышь со случайными координатами в комнате.

Как получить случайные координаты?

Это ты уже должен был знать. На всякий случай даю подсказку:

int x = (int) (Math.random() * width);

Еще понадобится метод - eatMouse(), на случай, если мышь все-таки кто-то съест :)

Пока сложной логики в этом методе не будет - просто будем вызывать метод createMouse и все.

Требования:
1. В классе Room должен быть создан метод createMouse.
2. В методе createMouse должна быть создана новая мышь по правилам описанным в условии и сохранена в поле mouse.
3. В классе Room должен быть создан метод eatMouse.
4. В методе eatMouse должен содержаться вызов метода createMouse.
---------------------------------------------------------------------------------------
Змейка(12)

Змея у нас есть, пусть и мышь будет.

Добавить в метод main:
a) вызов метода createMouse().
б) вызов метода run(). Без него ничего работать не будет. В нем вся основная логика.

Неплохо получилось, но я все-таки внесу пару правок.
Кстати, как насчет написать метод sleep?
Ты уже понял из предыдущих задач, что в методе run нужна пауза.
Но насколько я помню, скорость в змейке должна расти при росте ее длины.
Значит чем длиннее змея, тем выше скорость и меньше пауза.

Требования:
1. В методе main классе Room должен быть вызван метод createMouse на объекте типа Room.
2. В методе main классе Room должен быть вызван метод run на объекте типа Room.
3. В классе Room должен быть создан метод sleep без параметров.
---------------------------------------------------------------------------------------
Змейка(13)

Предлагаю тебе в этот раз написать специальный метод sleep(), который будет делать паузу в зависимости от длины змеи (количества элементов в sections).
Придумай какой-нибудь хитрый алгоритм. Чтобы на первом уровне пауза была 500 миллисекунд,
к 11 уровню постепенно уменьшилась до 300. А к 15 до 200. И дальше оставалась постоянной.

Требования:
1. Метод sleep должен вызывать метод Thread.sleep(500) в начале игры.
2. Метод sleep должен вызывать метод Thread.sleep(300) на 11 уровне.
3. Метод sleep должен вызывать метод Thread.sleep(200) для уровней больше 15.
---------------------------------------------------------------------------------------
Змейка(14)
Теперь поработаем над методом print().

Надо:
а) вывести на экран прямоугольник из точек размером width x height.
б) тело змеи отметить символом "x"-английское
в) голову змеи нарисовать символом "X"-английское.

Подсказка:
а) удобно сначала создать матрицу типа int[][] с размером (height x width)
б) затем пройтись по всем объектам и отрисовать их в матрицу.
Например, тело змеи - 1, голова змеи - 2, мышь - 3.

Требования:
1. Метод print должен выводить данные на экран.
2. Метод print должен выводить на экран количество строк равное height.
3. Количество символов в каждой строке выведенной на экран должно быть равно width.
4. Голова змеи должна быть отмечена символом X.
5. Тело змеи должно быть отмечено символами x.
6. Мышь должна быть отмечена символом ^.
---------------------------------------------------------------------------------------
Змейка(15)

Теперь осталось допилить змею.

Вот что я предлагаю насчет движения змеи:
Змея состоит из кусочков. Давай каждый ход просто добавлять один кусочек со стороны головы,
а самый последний - удалять. Тогда получится, что змея ползет.

Давай добавим два метода move, один без параметров, а другой с двумя параметрами типа int.

В методе move без параметров необходимо:
а) прекратить движение если змея умерла(isAlive == false)
б) вызвать метод move(0, -1) если направление движения равно SnakeDirection.UP
в) вызвать метод move(1, 0) если направление движения равно SnakeDirection.RIGHT
г) вызвать метод move(0, 1) если направление движения равно SnakeDirection.DOWN
д) вызвать метод move(-1, 0) если направление движения равно SnakeDirection.LEFT

Метод move с параметрами int, int пока оставим пустым.

Требования:
1. В методе move без параметров должен быть вызван метод move(0, -1), если направление движения равно SnakeDirection.UP.
2. В методе move без параметров должен быть вызван метод move(1, 0), если направление движения равно SnakeDirection.RIGHT.
3. В методе move без параметров должен быть вызван метод move(0, 1), если направление движения равно SnakeDirection.DOWN.
4. В методе move без параметров должен быть вызван метод move(-1, 0), если направление движения равно SnakeDirection.LEFT.
5. Метод move с параметрами (int, int) не должен быть вызван, если змея умерла (isAlive == false).
6. В классе Snake должен быть создан метод move без параметров.
7. В классе Snake должен быть создан метод move с параметрами int, int.
---------------------------------------------------------------------------------------
Змейка(16)

Ничто не вечно. Так и змея должна умирать, если она врезается в стену или саму себя.

Для определения, не пересекается ли змея сама с собой, можно сделать очень простую проверку:
содержит ли список sections "новую голову змеи".

Код для этого будет выглядеть примерно так:
if (sections.contains(head))

При этом head должен быть еще не добавлен в список sections, иначе будет всегда true.
Но чтобы этот код работал, надо реализовать методы сравнения объектов (equals и hashCode) в классе SnakeSection.

Подсказка:
Используй Ctrl+O в Intellij IDEA для автоматической генерации методов equals и hashCode.

Задание:
а) реализуй методы equals и hashCode в классе SnakeSection.
б) реализуй метод checkBorders(SnakeSection head): если голова змеи за границами комнаты - змея умирает (isAlive = false)
в) реализуй метод checkBody(SnakeSection head): если голова змеи пересекается с ее телом - змея умирает (isAlive = false)

Требования:
1. В классе SnakeSection должен быть метод equals.
2. В классе SnakeSection должен быть метод hashCode.
3. В классе Snake должен быть реализован, в соответствии с условием, метод checkBorders.
4. В классе Snake должен быть реализован, в соответствии с условием, метод checkBody.
---------------------------------------------------------------------------------------
Змейка(17)

Теперь закончим класс Snake.

Змея состоит из кусочков. Давай каждый ход просто добавлять один кусочек со стороны головы,
а самый последний - удалять. Тогда получится, что змея ползет.
Добавлять кусочек нужно рядом с текущей головой (кусочком номер 0).
С какой стороны добавлять зависит от direction (UP, DOWN, LEFT, RIGHT).

Подсказка:
а) Как добавить кусочек змеи в начало списка sections?
sections.add(0, new_section);
б) А как удалить последний?
sections.remove(sections.size()-1);

Необходимо реализовать метод move(int dx, int dy):
а) проверить, не вылезла ли она за границу комнаты (если да, то змея умирает)
б) проверить, не совпадает ли она с уже существующими кусочками змеи (если да, то змея умирает)
в) добавить голову к змее (со стороны головы) и удалить последний кусочек из хвоста.
г) вызвать метод eatMouse у статического объекта game класса Room, если координаты мыши совпадают с координатами головы змеи.
д) если змея поймала мышь (координаты головы совпадают с координатами мыши), то удалять кусок из хвоста не надо.

Требования:
1. В методе move(int dx, int dy) должен быть вызван метод checkBorders.
2. В методе move(int dx, int dy) должен быть вызван метод checkBody.
3. В случае если змея осталась жива, необходимо добавить голову и удалить последний элемент из хвоста змеи.
4. В случае, если змея поймала мышь, необходимо добавить голову, но последний элемент удалять не нужно.
5. Необходимо вызвать метод eatMouse у статического объекта game класса Room, если координаты мыши совпадают с координатами головы змеи.
---------------------------------------------------------------------------------------
Змейка(18)

Отлично!
Запускаем и наслаждаемся змейкой.

Змейка готова!
*/
public class Snake{
    // Направление движения змеи
    private SnakeDirection direction;
    // Состояние - жива змея или нет.
    private boolean isAlive;
    // Список кусочков змеи.
    private ArrayList<SnakeSection> sections;

    public Snake(int x, int y){
        sections = new ArrayList<SnakeSection>();
        sections.add(new SnakeSection(x, y));
        isAlive = true;
    }

    public boolean isAlive(){
        return isAlive;
    }

    public int getX(){
        return sections.get(0).getX();
    }

    public int getY(){
        return sections.get(0).getY();
    }

    public SnakeDirection getDirection(){
        return direction;
    }

    public void setDirection(SnakeDirection direction){
        this.direction = direction;
    }

    public ArrayList<SnakeSection> getSections(){
        return sections;
    }

    /**
     * Метод перемещает змею на один ход.
     * Направление перемещения задано переменной direction.
     */
    public void move(){
        if (!isAlive) return;

        if (direction == SnakeDirection.UP)
            move(0, -1);
        else if (direction == SnakeDirection.RIGHT)
            move(1, 0);
        else if (direction == SnakeDirection.DOWN)
            move(0, 1);
        else if (direction == SnakeDirection.LEFT)
            move(-1, 0);
    }

    /**
     * Метод перемещает змею в соседнюю клетку.
     * Координаты клетки заданы относительно текущей головы с помощью переменных (dx, dy).
     */
    private void move(int dx, int dy){
        // Создаем новую голову - новый "кусочек змеи".
        SnakeSection head = sections.get(0);
        head = new SnakeSection(head.getX()+dx, head.getY()+dy);

        // Проверяем - не вылезла ли голова за границу комнаты
        checkBorders(head);
        if (!isAlive) return;

        // Проверяем - не пересекает ли змея  саму себя
        checkBody(head);
        if (!isAlive) return;

        // Проверяем - не съела ли змея мышь.
        Mouse mouse = Room.game.getMouse();
        if (head.getX() == mouse.getX() && head.getY() == mouse.getY()){ // съела
            sections.add(0, head);                  // Добавили новую голову
            Room.game.eatMouse();                   // Хвост не удаляем, но создаем новую мышь.
        }else{ // просто движется
            sections.add(0, head);                  // добавили новую голову
            sections.remove(sections.size()-1);   // удалили последний элемент с хвоста
        }
    }

    /**
     * Метод проверяет - находится ли новая голова в пределах комнаты
     */
    private void checkBorders(SnakeSection head){
        if ((head.getX() < 0 || head.getX() >= Room.game.getWidth()) || head.getY() < 0 || head.getY() >= Room.game.getHeight()){
            isAlive = false;
        }
    }

    /**
     * Метод проверяет - не совпадает ли голова с каким-нибудь участком тела змеи.
     */
    private void checkBody(SnakeSection head){
        if (sections.contains(head)){
            isAlive = false;
        }
    }
}
