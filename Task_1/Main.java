package HomeTask_OOP.Task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Домашнее задание
Создать наследника класса Продукта - ГорячийНапиток с дополнительным полем 
int температура.
Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат 
и реализовать перегруженный метод getProduct(int name, int volume, int temperature) 
выдающий продукт соответствующий имени, объему и температуре
В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и
воспроизвести логику заложенную в программе
Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре

*/

public class Main {
    public static void main(String[] args) {
        
        
        List<HotDrink> products = new ArrayList<>();
    
        HotDrinkVendingMachine machine = new HotDrinkVendingMachine(products);
        Scanner iScan = new Scanner(System.in);
        System.out.println("----------- ---------- ----------");
        System.out.println("What hotDrink you'd like to get: ");
        String name = iScan.nextLine();
        iScan.close();
        
        
        HotDrink hotDrink = machine.findProduct(name);
        System.out.println(hotDrink.toString());

        // Воспроизведение логики
        // Product drink = machine.getProduct("coffee", 300, 70); // Предположим, что это Кофе
        
                // "Напиток: " + drink.getName() + ", Цена: " + drink.getPrice() + ", Температура: " + drink.getTemperature());

        // HotDrinkVendingMachine machine = new HotDrinkVendingMachine();
        // HotDrink product1 = machine.getProduct("coffee", 100, 70);
        // HotDrink product2 = machine.getProduct("blackTea", 80, 80);
        // HotDrink product3 = machine.getProduct("greenTea", 70, 80);
        // HotDrink product4 = machine.getProduct("PuEr", 90, 80);

        // Product drink = machine.getProduct("coffee", 300, 70); // Предположим, что это Кофе
        // System.out.println(
        // "Напиток: " + drink.getName() + ", Объем: " + drink.getPrice() + ", Цена: " + drink.getTemperature());
    
    }
}


