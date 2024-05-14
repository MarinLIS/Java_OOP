package HomeTask_OOP.Task_1;

public abstract class Product {

    private String name;
    private int price;
    private int temperature;

    public Product(String name, int price, int temperature) {
        this.name = name;
        this.price = price;
        this.temperature = temperature;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
    
}


