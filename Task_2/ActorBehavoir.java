package HomeTask_OOP.Task_2;

/*Интерфейс ActorBehavoir,
который будет содержать
описание возможных
действий актора в
очереди/магазине */
public interface ActorBehavoir {
    void setMakeOrder(boolean makeOrder);

    void setTakeOrder(boolean takeOrder);
    
    boolean isMakeOrder();

    boolean isTakeOrder();
}
