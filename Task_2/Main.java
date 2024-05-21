package HomeTask_OOP.Task_2;

import java.util.ArrayList;
import java.util.List;

/*Интерфейс ActorBehavoir,
который будет содержать
описание возможных
действий актора в
очереди/магазине
2. Абстрактный класс Actor,
который хранит в себе
параметры актора, включая
состояние готовности сделать
заказ и факт получения
заказа.
Дополнение: для большего понимания, можно сделать методы-геттеры для имени и прочих
“персональных данных” abstract
3. Класс Human, который должен наследоваться от Actor и реализовывать ActorBehavoir

Необходимо реализовать строение классов, без
конкретной реализации:
1. Интерфейс QueueBehaviour, который описывает
логику очереди – помещение в/освобождение из
очереди, принятие/отдача заказа
2. Интерфейс MarketBehaviour, который описывает
логику магазина – приход/уход покупателей,
обновление состояния магазина
3. Класс Market, который реализовывает два
вышеуказанных интерфейса и хранит в списке список
людей в очереди в различных статусах 

1. актор пришел в магазин и встал в очередь
2. актора спросили хочет сделать заказ,если да -  сделал заказ, 
                                            нет - вышел из очереди и магазина (пункт 4)
3. Если сделал заказ, актор получил заказ
4. актор вышел из очереди и вышел из магазина
*/
public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        
        List<Actor> queueList = new ArrayList<>();
        Human human1 = new Human("АLex");
        Human human2 = new Human("Bob");
        Human human3 = new Human("Den");
        Human human4 = new Human("Elen");
        market.acceptToMarket(human1);
        queueList.add(human1);
        market.acceptToMarket(human2);
        queueList.add(human1);
        market.acceptToMarket(human3);
        queueList.add(human1);
        market.acceptToMarket(human4);
        queueList.add(human1);

        market.update();
        
    }
}