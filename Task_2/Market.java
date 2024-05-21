package HomeTask_OOP.Task_2;

import java.util.ArrayList;
/* Реализовать класс Market и все методы, которые он
обязан реализовывать.
Методы из интерфейса QueueBehaviour, имитируют
работу очереди,
MarketBehaviour – помещает и удаляет человека из очереди,
метод update – обновляет состояние магазина
(принимает и отдает заказы)
чтобы программа выглядела более живой надо организовать выводы в консоль
в методе acceptToMarket - вывод, что актор пришел в магазин и добавить его в очередь
в методе TakeinQueue - добавить посетителя в очередь, то есть в список 
в методе acceptToMarket - вызывать метод добавления в очередь
в методе TakeOrders - проходить по всему списку очереди и проверять 
с помощью метода isMakeOrders в списке очереди тех, у кого заказ не был сделан 
и проставлять флаг с помощью нашего сеттера isMakeOrder
в методе GiveOrders - пробегаем по списку заказчиков и проверяем флаг isMakeOrder 
стоит тру и проставляем флаг isTakeOrder тоже тру
метод releasedFromQueue - составить список акторов  готовых выходить из магазина 
это мы можем сделать по методу isTakeorder
releasedFromMarket - удаляем посетителей из магазина, то есть удаляем из списка, 
который находится в переменной и этот  метод мы вызываем из предыдущего метода
update - здесь три метода это: TakeOrders, GiveOrders и releasedFromQueue
*/
import java.util.List;
import java.util.Scanner;

public class Market implements MarketBehavoir, QueueBehaviour {
    private final List<Actor> queue;

    public Market() {
        this.queue = new ArrayList<>();
    }

    @Override
    public void takeInQueue(Actor actor) {// встает в очередь
        System.out.println(actor.getName() + " встал в очередь");
        this.queue.add(actor);
    }

    @Override
    public void acceptToMarket(Actor actor) {// заходит в магазин
        System.out.println(actor.getName() + " пришел в магазин");
        takeInQueue(actor);
    }

    

    @Override
    public void takeOrders() {
        Scanner sc = new Scanner(System.in);
        for (Actor actor : queue) {
            System.out.println("Do you want to make the order, " + actor.getName() + "?");
            while (true) {
                System.out.print("""
                        Main menu:
                        1 - Yes
                        2 - No
                        >\s""");
                var selection = sc.next();
                switch (selection) {
                    case "1" -> {
                        actor.setMakeOrder(true);
                    }
                    case "2" -> {
                        actor.setMakeOrder(false);
                    }
                }
                break;
            }
        }
        sc.close();
        giveOrders();
    }
       


    @Override
    public void giveOrders() {
        for (Actor actor : queue) {
            if (actor.isMakeOrder()) {
                actor.setTakeOrder(true);
                System.out.println(actor.getName() + " получил свой заказ");

            } else {
                actor.setTakeOrder(false);
                System.out.println(actor.getName() + " не делал(а) заказ");
            }
        }
        releasedFromQueue();
    }

    @Override
    public void releasedFromQueue() {
        List<Actor> releasedActors = new ArrayList<>();
        for (Actor actor : queue) {
            if (actor.isTakeOrder()) {
                actor.setTakeOrder(false);
                System.out.println(actor.getName() + " вышел из очереди");
                releasedActors.add(actor);
            } else if (!actor.isTakeOrder) {
                actor.setTakeOrder(false);
                System.out.println(actor.getName() + " заказ не делал(а) и вышел из очереди");
                releasedActors.add(actor);
            }

        }
        releasedFromMarket(releasedActors);
        queue.removeAll(releasedActors);
    }

    public void releasedFromMarket(List<Actor> actorlist) {
        List<Actor> newQueue = new ArrayList<>(actorlist);
        for (Actor actor : newQueue) {
            System.out.println(actor.getName() + " вышел(а) из магазина");
            actorlist.remove(actor);
        }
    }

    @Override
    public void update() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Is the market opened?");
        while (true) {
            System.out.print("""
                    Main menu:
                    1 - Yes
                    2 - No
                    >\s""");
            var selection = scan.next();
            switch (selection) {
                case "1" -> {
                    takeOrders();
                }
                case "2" -> {
                    System.out.println("Working hours 09:00 - 21:00");
                }
            }
            break;
        }
        scan.close();
    }
}

/*package homeworks.homework_002;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Market implements MarketBehaviour, QueueBehaviour {
    private final List<Actor> queue;
    Random random = new Random();

    public Market() {
        this.queue = new ArrayList<>();
    }

    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() + " пришел в магазин");
        takeInQueue(actor);
    }

    @Override
    public void takeInQueue(Actor actor) {
        System.out.println(actor.getName() + " встал в очередь");
        this.queue.add(actor);
    }

    @Override
    public void takeOrders() {
        for (Actor actor : queue) {
            if (!actor.isMakeOrder()) {
                actor.setMakeOrder(true);
                System.out.println(actor.getName() + " сделал свой заказ");
            }
        }
    }

    @Override
    public void giveOrders() {
        for (Actor actor : queue) {
            if (actor.isMakeOrder()) {
                actor.setTakeOrder(true);
                System.out.println(actor.getName() + " получил свой заказ");
            }
        }
    }

    @Override
    public void releaseFromQueue() {
        List<Actor> repeatInQueue = new ArrayList<>();
        List<Actor> releasedActors = new ArrayList<>();
        boolean repeatOrder;
        for (Actor actor : queue) {
            if (actor.isTakeOrder()) {
                repeatOrder = random.nextBoolean();
                if (repeatOrder) {
                    releasedActors.add(actor);
                    System.out.println(actor.getName() + " вышел из очереди");
                } else {
                    actor.setMakeOrder(false);
                    actor.setTakeOrder(false);
                    repeatInQueue.add(actor);
                    System.out.println(actor.getName() + " вышел из очереди, но не вышел из магазина");
                }
            }
        }
        releaseFromMarket(releasedActors);
        for (Actor actor : repeatInQueue) {
            takeInQueue(actor);
            queue.remove(actor);
        }
    }


    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getName() + " вышел из магазина");
            queue.remove(actor);
        }
    }

    @Override
    public void update() {
        takeOrders();
        giveOrders();
        releaseFromQueue();
    }

    public boolean checkActorInMarket () {
        return queue.isEmpty();
    }
} */