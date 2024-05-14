package HomeTask_OOP.Task_1;

public class HotDrink extends Product {

    public HotDrink(String name, int price, int temperature) {
        super(name, price, temperature);
    }
/*Создать наследника класса Продукта - ГорячийНапиток с дополнительным полем 
int температура. */
    @Override
    public String toString() {
        return "name " + getName() + " price " + getPrice() + " temperature " + getTemperature();
    }

}
