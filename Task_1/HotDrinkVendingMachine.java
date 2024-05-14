package HomeTask_OOP.Task_1;

import java.util.ArrayList;
import java.util.List;

/*Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат 
и реализовать перегруженный метод getProduct(int name, int volume, int temperature) 
выдающий продукт соответствующий имени, объему и температуре */

public class HotDrinkVendingMachine implements VendingMachine{
    private static List<HotDrink> products = new ArrayList<>();

    public HotDrinkVendingMachine(List<HotDrink> products) {
        products = initProduct();
    }

    @Override
    public void getProduct() {
    }

    public HotDrink getProduct(String name, int price, int temperature) {
        return new HotDrink(name, price, temperature);
    }
    
    public static List<HotDrink> initProduct() {
        HotDrink coffee = new HotDrink("Coffee", 100, 70);
        HotDrink blackTea = new HotDrink("Black tea", 80, 80);
        HotDrink greenTea = new HotDrink("Green tea", 70, 80);
        HotDrink PuEr = new HotDrink("Pu-Er tea", 90, 80);
        products.add(coffee);
        products.add(blackTea);
        products.add(greenTea);
        products.add(PuEr);
        System.out.println("We have following hotDrinks:");
        for (HotDrink hotDrink : products) {
            System.out.println(hotDrink.toString());
        }
        return products;
    }
    
    public HotDrink findProduct(String name){
        for (HotDrink hotDrink : products) {
            if (hotDrink.getName().equals(name)) {      
                return hotDrink;          
            }
        }
        return null;
    }

   

}
