package HomeTask_OOP.Task_2;
/*Абстрактный класс Actor,
который хранит в себе
параметры актора, включая
состояние готовности сделать
заказ и факт получения
заказа.
Дополнение: для большего понимания, можно сделать методы-геттеры для имени и прочих
“персональных данных” abstract */

public abstract class Actor implements ActorBehavoir {
    boolean isTakeOrder;
    boolean isMakeOrder;
    String name;
    

    public Actor(String name) {
        this.name = name;
    }

    public abstract String getName();

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
