package HomeTask_OOP.Task_1;

public class HotDrink extends Product {
    private int temperature;

    public HotDrink(String name, int price, int temperature) {
        super(name, price);
        this.temperature = temperature;

    }
    
    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
    
/*Создать наследника класса Продукта - ГорячийНапиток с дополнительным полем 
int температура. */
    @Override
    public String toString() {
        return "name " + getName() + " price " + getPrice() + " temperature " + getTemperature();
    }

}
