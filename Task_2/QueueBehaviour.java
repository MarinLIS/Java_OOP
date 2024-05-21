package HomeTask_OOP.Task_2;

/*Интерфейс QueueBehaviour, который описывает
логику очереди – помещение в/освобождение из
очереди, принятие/отдача заказа */
public interface QueueBehaviour {
    void takeInQueue(Actor actor);// встал в очередь

    void takeOrders(); // сделал заказ

    void giveOrders();// забрал заказ

    void releasedFromQueue(); // выщел из очереди
}
